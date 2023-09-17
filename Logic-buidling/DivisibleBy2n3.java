import java.util.Scanner;

public class DivisibleBy2n3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isDivisibleByTwoAndThree(number)) {
            System.out.println(number + " is divisible by both 2 and 3.");
        } else {
            System.out.println(number + " is not divisible by both 2 and 3.");
        }
    }
    
    public static boolean isDivisibleByTwoAndThree(int number) {
        return number % 2 == 0 && number % 3 == 0;
    }
}

