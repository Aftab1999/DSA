import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {

        String checkpalindrome = "Abba"; 

        String reverse = "";

     
        for (int i = checkpalindrome.length() - 1; i >= 0; i--) {
            reverse += checkpalindrome.charAt(i);
        }

        if (checkpalindrome.equalsIgnoreCase(reverse)) { 
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }
    }
}
