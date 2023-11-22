// import java.util.Scanner;

// public class Main

// {

//   public static void main(String[] args)

//   {

//     Scanner sc = new Scanner(System.in);

//     System.out.print("Input the first number: ");

//     double x = sc.nextDouble();

//     System.out.print("Input the second number: ");

//     double y = sc.nextDouble();

//     System.out.print("Input the third number: ");

//     double z = sc.nextDouble();

//     System.out.print("The average value is " + average(x, y, z) + "\n");

//   }

//   public static double average(double x, double y, double z) {

//     return (x + y + z) / 3;

//   }

// }

// import java.util.*;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num;
//     System.out.print("Enter an integer: ");
//     num = sc.nextInt();
//     if (isEven(num)) {
//       System.out.println("Number is even");
//     } else {
//       System.out.println("Number is odd");

//     }
//   }

//   public static boolean isEven(int number) {
//     if (number % 2 == 0) {
//       return true;
//     } else {
//       return false;
//     }
//   }
// }

// import java.util.Scanner;
// public class Main
// {
// public static void main (String args[])
// {
// System.out.println ("Please Enter a number : ");
// Scanner sc = new Scanner (System.in);
// int palindrome = sc.nextInt ();
// if (isPalindrome (palindrome))
// {
// System.out.println ("Number : " + palindrome + " is a palindrome");
// }
// else
// {
// System.out.println ("Number : " + palindrome +
// " is not a palindrome");
// }
// }
// public static boolean isPalindrome (int number)
// {
// int palindrome = number;
// int reverse = 0;
// while (palindrome != 0)
// {
// int remainder = palindrome % 10;
// reverse = reverse * 10 + remainder;
// palindrome = palindrome / 10;
// }

// if (number == reverse)
// {
// return true;
// }
// return false;
// }
// }

// import java.util.Scanner;
// public class Main
// {
// public static void main (String[]args)
// {
// Scanner sc = new Scanner (System.in);
// System.out.print ("Input an integer: ");
// int digits = sc.nextInt ();
// System.out.println ("The sum is " + sumDigits (digits));
// }
// public static int sumDigits (int n)
// {
// int sumOfDigits = 0;
// while (n > 0)
// {
// int lastDigit = n % 10;
// sumOfDigits += lastDigit;
// n /= 10;
// }
// return sumOfDigits;
// }
// }
