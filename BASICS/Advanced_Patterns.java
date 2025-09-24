public class Advanced_Patterns {
    // function1
    public static void hollowRectangularPattern(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner loop --> columns
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    // function 2
    public static void halfPyramid(int totLines) {
        for (int i = 1; i <= totLines; i++) {
            // spaces
            for (int j = 1; j <= totLines - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // function 3
    public static void halfPyramidNumbers(int totLines) {

        for (int line = 1; line <= totLines; line++) {
            // in each line we want
            for (int num = 1; num <= totLines - line + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // function 4
    public static void floyds_Triangle(int totLines) {
        int num = 1;
        for (int line = 1; line <= totLines; line++) {
            // numbers in each line
            for (int j = 1; j <= line; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
    }

    // function 5
    public static void triangle_01(int totLines) {
        for (int i = 1; i <= totLines; i++) {
            // in each line
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    // function 6
    public static void butterflyPattern(int totLines) {
        // first half
        for (int line = 1; line <= totLines; line++) {
            // stars in each line
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            // spaces in each line
            for (int spaces = 1; spaces <= 2 * (totLines - line); spaces++) {
                System.out.print(" ");
            }
            // stars in each line
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half //method 1

        for (int line = 1; line <= totLines; line++) {
            // stars in each line
            for (int stars = 1; stars <= totLines - line + 1; stars++) {
                System.out.print("*");
            }
            // spaces in each line
            for (int spaces = 1; spaces <= 2 * (line - 1); spaces++) {
                System.out.print(" ");
            }
            // stars in each line
            for (int stars = 1; stars <= totLines - line + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
         * // second half with //method 2 --> shradha khapra
         * for (int line = totLines;line >=1;line--){
         * for (int stars = 1 ; stars <= line ; stars ++){
         * System.out.print("*");
         * }
         * for (int spaces =1; spaces <= 2*(totLines - line);spaces++){
         * System.out.print(" ");
         * }
         * for (int stars =1 ; stars <= line ;stars++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
    }

    // function 7
    public static void solidRhombus(int totLines) {
        for (int line = 1; line <= totLines; line++) {
            // in each line //spaces
            for (int spaces = 1; spaces <= totLines - line; spaces++) {
                System.out.print(" ");
            }
            // stars
            for (int stars = 1; stars <= totLines; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // function 8
    public static void hollowRhombus(int totLines) {
        for (int line = 1; line <= totLines; line++) {
            // spaces
            for (int spaces = 1; spaces <= totLines - line; spaces++) {
                System.out.print(" ");
            }
            /*
             * -->> METHOD 1 BY ME
             * //stars
             * //in 1 st and last line
             * if (line==1 || line == totLines){
             * 
             * for (int stars = 1; stars <= totLines; stars++ ){
             * System.out.print("*");
             * }
             * //for all the lines
             * }else{
             * 
             * System.out.print("*");
             * for (int spaces =1; spaces <= totLines-2;spaces++){
             * System.out.print(" ");
             * }
             * System.out.print("*");
             * }
             * System.out.println();
             */
            // METHOD 2 BY --->>> shradha khapra
            for (int stars = 1; stars <= totLines; stars++) {
                if (line == 1 || stars == 1 || line == totLines || stars == totLines) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // function 9
    public static void diamondPattern(int totLine) {
        // 1st half
        for (int line = 1; line <= totLine; line++) {
            // spaces
            for (int spaces = 1; spaces <= totLine - line; spaces++) {
                System.out.print(" ");
            }
            // stars
            for (int stars = 1; stars <= 2 * line - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int line = totLine; line >= 1; line--) {
            // spaces
            for (int spaces = 1; spaces <= totLine - line; spaces++) {
                System.out.print(" ");
            }
            // stars
            for (int stars = 1; stars <= 2 * line - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangularPattern(4, 5);// calling a function 1

        halfPyramid(4); // calling the function 2

        halfPyramidNumbers(5); // calling the function 3

        floyds_Triangle(5); // calling the function 4

        triangle_01(5); // calling the function 5

        butterflyPattern(4); // calling the function 6

        solidRhombus(15); // calling the function 7

        hollowRhombus(5); // calling the function 8

        diamondPattern(4); // calling the function 9
    }
}