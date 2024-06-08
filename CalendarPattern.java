public class CalendarPattern {
    public static void main(String[] args) {
        int[][] calendar = {
            { 0, 0, 0, 0, 0, 0, 0 },
            { 30, 31, 0,  0,  0,  0,  0 },
            { 23, 24, 25, 26, 27, 28, 29 },
            { 16, 17, 18, 19, 20, 21, 22 },
            { 9,  10, 11, 12, 13, 14, 15 },
            { 2,  3,  4,  5,  6,  7,  8  },
            { 1,  0,  0,  0,  0,  0,  0  }
        };

        String[] days = {" M ", " T ", " W ", "TH ", " F ", " S ", "SU "};

        // Print the calendar pattern
        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < calendar[i].length; j++) {
                if (i == 0) {
                    System.out.print(days[j]);
                } else if (calendar[i][j] == 0) {
                    System.out.print("   ");
                } else if (calendar[i][j] < 10) {
                    System.out.print(" " + calendar[i][j] + " ");
                } else {
                    System.out.print(calendar[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
