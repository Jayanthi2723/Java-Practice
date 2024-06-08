import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PageFaultCounter {

    private static int[] openAndRead(String filename) {
        //creating an input stream to read the inputfile.in file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            int length = line.split("\\s+").length;
            int[] referenceString = new int[length]; //an array the same size as the word count in the line
            line = reader.readLine(); //reading the second line
            String[] words = line.split("\\s+"); //separating by spaces in between
            for (int i = 0; i < length; i++) {
                referenceString[i] = Integer.parseInt(words[i]);
            }
            return referenceString;
        } catch (IOException e) {
            System.out.println("Error reading reference string file: " + e.getMessage());
        }

        return new int[0];
    }

    private static int FifoPageFaults(int[] referenceString, PageFrames pageFrames) {
        int pageFaults = 0;

        for (int page : referenceString) { // Iterate over each page in the reference string
            if (!pageFrames.contains(page)) { // Check if the page is not present in the page frames
                pageFrames.replace(page); // Replace a page in the page frames with the current page
                pageFaults++; // Increment the page faults count
            }
        }

        return pageFaults; // Return the total page faults count
    }

    private static int LruPageFaults(int[] referenceString, PageFrames pageFrames) {
        int pageFaults = 0;
        List<Integer> recentPages = new ArrayList<>(); // List to track the recently used pages

        for (int page : referenceString) { // Iterate over each page in the reference string
            if (!pageFrames.contains(page)) { // Check if the page is not present in the page frames
                if (pageFrames.isFull()) { // Check if the page frames are full
                    int leastRecentlyUsedPage = recentPages.remove(0); // Remove the least recently used page from the page frames
                    pageFrames.remove(leastRecentlyUsedPage);
                }

                pageFrames.replace(page); // Replace a page in the page frames with the current page
                recentPages.add(page); // Add the current page to the list of recently used pages
                pageFaults++; // Increment the page faults count
            } else {
                recentPages.remove(Integer.valueOf(page)); // Remove the page from the list of recently used pages
                recentPages.add(page); // Add the page to the list of recently used pages
            }
        }

        return pageFaults;
    }

    private static int ClockPageFaults(int[] referenceString, PageFrames pageFrames) {
        int pageFaults = 0;
        int hand = 0; // Clock hand pointer

        for (int page : referenceString) { // Iterate over each page in the reference string
            if (!pageFrames.contains(page)) { // Check if the page is not present in the page frames
                while (pageFrames.frames[hand] != -1 && pageFrames.frames[hand] >= 0) {
                    // Iterate through the page frames using the clock hand pointer
                    // If the frame at the clock hand position is not empty (-1) and not referenced (>= 0)
                    pageFrames.frames[hand] = -1; // Set the frame to empty (-1)
                    hand = (hand + 1) % pageFrames.frames.length; // Move the clock hand to the next frame
                }

                pageFrames.replace(page); // Replace a page in the page frames with the current page
                hand = (hand + 1) % pageFrames.frames.length; // Move the clock hand to the next frame
                pageFaults++; // Increment the page faults count
            }
        }
  }
