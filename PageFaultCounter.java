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
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            int length = line.split("\\s+").length;
            int[] referenceString = new int[length];
            line = reader.readLine();
            String[] words = line.split("\\s+");
            for (int i = 0; i < length; i++) {
                referenceString[i] = Integer.parseInt(words[i]);
            }
            return referenceString;
        } catch (IOException e) {
            System.out.println("Error reading reference string file: " + e.getMessage());
        }
        return new int[0];
    }

    private static int OptPageFaults(int[] referenceString, int numFrames) {
        int pageFaults = 0;
        Set<Integer> frames = new HashSet<>();

        for (int i = 0; i < referenceString.length; i++) {
            int page = referenceString[i];

            if (!frames.contains(page)) {
                if (frames.size() < numFrames) {
                    frames.add(page);
                } else {
                    int farthestIndex = findFarthestPage(referenceString, frames, i);
                    if (farthestIndex != -1) {
                        int pageToReplace = referenceString[farthestIndex];
                        frames.remove(pageToReplace);
                        frames.add(page);
                        pageFaults++;
                    }
                }
            }
        }

        return pageFaults;
    }

    private static int FIFOPageFaults(int[] referenceString, Set<Integer> frames, int numFrames) {
        int pageFaults = 0;

        for (int page : referenceString) {
            if (!frames.contains(page)) {
                if (frames.size() >= numFrames) {
                    int firstPage = frames.iterator().next();
                    frames.remove(firstPage);
                }
                frames.add(page);
                pageFaults++;
            }
        }

        return pageFaults;
    }

    private static int LRUPageFaults(int[] referenceString, Set<Integer> frames, int numFrames) {
        int pageFaults = 0;
        List<Integer> recentPages = new ArrayList<>();

        for (int page : referenceString) {
            if (!frames.contains(page)) {
                if (frames.size() >= numFrames) {
                    int leastRecentlyUsedPage = recentPages.remove(0);
                    frames.remove(leastRecentlyUsedPage);
                }

                frames.add(page);
                recentPages.add(page);
                pageFaults++;
            } else {
                recentPages.remove(Integer.valueOf(page));
                recentPages.add(page);
            }
        }

        return pageFaults;
    }

    private static int ClockPageFaults(int[] referenceString, Set<Integer> frames, int numFrames) {
        int pageFaults = 0;
        int hand = 0;

        for (int page : referenceString) {
            if (!frames.contains(page)) {
                while (frames.contains(hand)) {
                    frames.remove(hand);
                    hand = (hand + 1) % numFrames;
                }

                frames.add(page);
                hand = (hand + 1) % numFrames;
                pageFaults++;
            }
        }

        return pageFaults;
    }

    private static int findFarthestPage(int[] referenceString, Set<Integer> frames, int currentIndex) {
        int farthestIndex = -1;
        int maxDistance = -1;

        for (int i = currentIndex + 1; i < referenceString.length; i++) {
            int page = referenceString[i];

            if (frames.contains(page)) {
                int distance = i - currentIndex;

                if (distance > maxDistance) {
                    maxDistance = distance;
                    farthestIndex = i;
                }
            }
        }

        return farthestIndex;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java PageFaultCounter <filename> <numFrames>");
            return;
        }

        String filename = args[0];
        int numFrames = Integer.parseInt(args[1]);
        int[] referenceString = openAndRead(filename);
        System.out.println("Reference String: " + Arrays.toString(referenceString));
        System.out.println("Number of Frames: " + numFrames);
        Set<Integer> fifoFrames = new HashSet<>();
        Set<Integer> lruFrames = new HashSet<>();
        Set<Integer> clockFrames = new HashSet<>();
        int optPageFaults = OptPageFaults(referenceString, numFrames);
        int fifoPageFaults = FIFOPageFaults(referenceString, fifoFrames, numFrames);
        int lruPageFaults = LRUPageFaults(referenceString, lruFrames, numFrames);
        int clockPageFaults = ClockPageFaults(referenceString, clockFrames, numFrames);
        System.out.println("Replacement Strategy\tPage Faults");
        System.out.println("------------------------------------");
        System.out.println("OPT\t\t\t" + optPageFaults);
        System.out.println("FIFO\t\t\t" + fifoPageFaults);
        System.out.println("LRU\t\t\t" + lruPageFaults);
        System.out.println("Clock\t\t\t" + clockPageFaults);
    }
}
