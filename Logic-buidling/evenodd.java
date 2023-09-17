// Implement a program to check if a given number is even or odd without using the modulus operator (%).

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Number: ");
         int Num = scanner.nextInt();

        int  lastDigits = Num - ((Num / 10) * 10 );

        if (lastDigits == 0) {
           System.out.print("The number is even"); 
        }else{
             System.out.print("The number is Odd"); 
        }

    }
}
