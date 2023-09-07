package Patterns;
// Patterns part 2

// ******
// *****
// ****
// ***
// **

import java.util.*;

public class Patterns2 {
    public static void main(String[] args) {
        int n = 5;

        for (int line = 0; line < n; line++) {
            for (int str = 1; str <= n - line + 1; str++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
