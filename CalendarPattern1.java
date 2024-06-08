public class CalendarPattern1 {
    public static void main(String[] args) {
        int[][] calendar = {
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 30, 31, 0,  0,  0,  0, 0 },
            { 0, 23, 24, 25, 26, 27, 28, 0 },
            { 0, 16, 17, 18, 19, 20, 21, 22 },
            { 0, 9,  10, 11, 12, 13, 14, 15 },
            { 0, 2,  3,  4,  5,  6,  7,  8  },
            { 0, 1,  0,  0,  0,  0,  0,  0  },
            { 0, 0,  0,  0,  0,  0,  0,  0  }
        };

        String[] days = {" M ", " T ", " W ", "TH ", " F ", " S ", "SU ", "  "};

        // Print the calendar pattern
        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < calendar[i].length; j++) {
                if (i == 0 || i == calendar.length - 1) {
                    System.out.print(days[j]);
                } else if (j == 0 || j == calendar[i].length - 1) {
                    System.out.print("   ");
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
