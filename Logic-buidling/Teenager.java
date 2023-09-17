// public class teenager {
    
// }

// Create a program to check if a user is a teenager, an adult, or a senior citizen based on their age.

import java.util.Scanner;

public class Teenager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an age: ");

        int age = scanner.nextInt();
        String category;

        if (age >= 60) {
            category = "Senior Citizen";
        } else if (age >= 18) {
            category = "Adult";
        } else if (age >= 10) {
            category = "Teenager";
        } else {
            category = "Child";
        }
        
        System.out.println("The category for the age " + age + " is " + category);
    }
}


