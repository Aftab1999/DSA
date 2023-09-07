// A
// BC
// DEF
// GHIJ


import java.util.*;

public class Patterns3 {
    public static void main(String[] args) {
        int rows = 4;
        char currentChar = 'A';

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar);
                currentChar++;
            }
            System.out.println();
        }
    }

}