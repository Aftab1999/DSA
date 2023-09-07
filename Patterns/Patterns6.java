
//    *
//    **
//    **
//    ***
//    ****












class Patterns6 {

    public static void printPattern(int n) {

        // outer loop

        for (int i = 1; i <= n; i++) {

            // spane
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }

            // Start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        printPattern(4);
    }

}

