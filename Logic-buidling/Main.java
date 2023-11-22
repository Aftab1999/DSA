
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         double number = scanner.nextDouble();
        
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }
        
//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();

//         boolean isLeapYear = false;

//         if (year % 4 == 0) {
//             if (year % 100 != 0 || year % 400 == 0) {
//                 isLeapYear = true;
//             }
//         }

//         if (isLeapYear) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }

//         scanner.close();
//     }
// }


// Implement a code that determines if a person is eligible to vote based on their age.

// import java.util.Scanner;

// public class Main{
//     public static void main(String args[]) {
//         int maxvot = 18;
        

//      Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a number: ");
//       int vot = sc.nextInt(); 
       
//       if(vot>= maxvot){
//           System.out.print("You are alegiable for vot");
//       }else{
//             System.out.print("You are not alegiable for vot");
//       }
     
        
//     }
// }




// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         double number = scanner.nextDouble();
        
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }
        
//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();

//         boolean isLeapYear = false;

//         if (year % 4 == 0) {
//             if (year % 100 != 0 || year % 400 == 0) {
//                 isLeapYear = true;
//             }
//         }

//         if (isLeapYear) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }

//         scanner.close();
//     }
// }


// Implement a code that determines if a person is eligible to vote based on their age.

// import java.util.Scanner;

// public class Main{
//     public static void main(String args[]) {
//         int maxvot = 18;
        

//      Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a number: ");
//       int vot = sc.nextInt(); 
       
//       if(vot>= maxvot){
//           System.out.print("You are alegiable for vot");
//       }else{
//             System.out.print("You are not alegiable for vot");
//       }
     
        
//     }
// }





// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();

//         if (isEven(n)) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }

//         scanner.close();
//     }

   
//     static boolean isEven(int n) {

//         return (n & 1) == 0;
//     }
// }


// import java.util.Scanner;

// public class Main {
    
//     public static void main(String[] args) {
  
//      Scanner scanner=new Scanner(System.in);
//      System.out.println("Enter a Number");
//       int year= scanner.nextInt();
     
//      if((year%4==0 && year%100!=0) || year% 400 ==0){
    
         
//          System.out.println("leap year");
//      }else
         
         
//          {
             
//              System.out.println(" not leap year");
//          }
             
      
//      }
     
        
//     }
    



// Write a program that classifies a student's grade based on their score in multiple subjects.


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of subjects: ");
//         int numSubjects = scanner.nextInt();

//         double totalScore = 0;
//         double subjectScore;


//         for (int i = 1; i <= numSubjects; i++) {
//             System.out.print("Enter the score for subject " + i + ": ");
//             subjectScore = scanner.nextDouble();
//             totalScore += subjectScore;
//         }

//         double averageScore = totalScore / numSubjects;

  
//         char grade;
//         if (averageScore >= 90) {
//             grade = 'A';
//         } else if (averageScore >= 80) {
//             grade = 'B';
//         } else if (averageScore >= 70) {
//             grade = 'C';
//         } else if (averageScore >= 60) {
//             grade = 'D';
//         } else {
//             grade = 'F';
//         }

       
//         System.out.println("Average Score: " + averageScore);
//         System.out.println("Grade: " + grade);

//         scanner.close();
//     }
// }




// public class Main {
    
//     public static void main(String[] args) {
     
        
//         for(int i = 2; i <=n; i++){
            
//             boolean prime = true;
            
//             for(int j = 2; j<=i/2; j++)
//             if(i % j == 0){
//               prime = false;
//                 break;
//             }
        
//         }
        
//         if(prime)
//         {
        
//         System.out.print(i + "");
//         }
        
//     }
    
// }

// public class Main {
    
//     public static void main(String[] args) {
//         int n = 100; 
        
//         for (int i = 2; i <= n; i++) {
//             boolean prime = true;
            
//             for (int j = 2; j <= i / 2; j++) {
//                 if (i % j == 0) {
//                     prime = false;
//                     break;
//                 }
//             }
            
//             if (prime) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


// perfect 


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int n = 1000;
//         // boolean prime = true;
//         int temp = 0;

//         for (int i = 1; i < n; i++) {
//             if (n % i == 0) {
              
//                 temp = temp + i;
//             }
//         }

//         if (temp == n) {
//             System.out.println(n + ": is perfect Number");
//         } else {
//             System.out.println(n + ": is not perfect Number");
//         }
//     }
// }



// Create a program that determines the type of a triangle based on its angles.


// import java.util.*;

// public class Main {

//     public static void main (String []args) {
//         int a, b, c;
//         a = 2;
//         b = 2;
//         c = 2;

//         int sqa = (int)Math.pow(a, 2);
//         int sqb = (int)Math.pow(b, 2);
//         int sqc = (int)Math.pow(c, 2);

//         if (sqa == sqa + sqb ||
//             sqb == sqa + sqc ||
//             sqc == sqa + sqb){
//             System.out.print("Right-angled Triangle");
//         }
//         else if(sqa > sqc + sqb ||
//                 sqb > sqa + sqc ||
//                 sqc > sqa + sqb){
//             System.out.print("Obtuse-angled Triangle");
//         }
//         else{
//             System.out.print( "Acute-angled Triangle");
//         }
//     }
// }


// Write a code to check if a number is divisible by both 5 and 7.


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int n = 10;
      
      

//             if (n % 5 == 0 && n % 7 ==0) {
//                 System.out.println(n + ": divisible by both 5 and 7");
//             }else{
//                 System.out.println(n + ": not divisible by both 5 and 7");
//             }

//     }
// }

// Write code to determine the eligibility of a person for a driving license based on their age and eyesight.


// import java.util.Scanner;

// public class Main {
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();

//         System.out.print("Enter your eyesight (in diopters): ");
//         double eyesight = scanner.nextDouble();

//         if (age >= 18 && eyesight >= 6.0) {
//             System.out.println("You are eligible for a driving license.");
//         } else {
//             System.out.println("You are not eligible for a driving license.");
//         }
//     }
// }


// Create a program that determines if a person is eligible to participate in a sports event based on their age and gender.



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();

//         System.out.print("Enter your gender (M/F): ");
//         char gender = scanner.next().charAt(0);

//         if (age >= 18 && gender == 'M') {
//             System.out.println("You are eligible to participate in the sports event.");
//         } else if (age >= 16 && gender == 'F') {
//             System.out.println("You are eligible to participate in the sports event.");
//         } else {
//             System.out.println("You are not eligible to participate in the sports event.");
//         }
//     }
// }


// check if a give year is century year or not











// To find the number of digits in a given number using a do-while loop, you can follow these steps in Java



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         long number = scanner.nextLong();

      
//         int digitCount = 0;

//         if (number == 0) {
//             digitCount = 1;
//         } else {
//             do {
//                 digitCount++;
//                 number /= 10;
//             } while (number != 0);
//         }

//         System.out.println("Number of digits: " + digitCount);
//     }
// }


// programm to find the revers of a given number and check if it is a palindrom using do while loop 


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int originalNumber = scanner.nextInt();
//         int number = originalNumber; 

//         int reverse = 0;
//         int remainder;

    
//         do {
//             remainder = number % 10; 
//             reverse = reverse * 10 + remainder; 
//             number = number / 10; 
//         } while (number != 0);

//         System.out.println("Reverse of the number: " + reverse);

    
//         if (originalNumber == reverse) {
//             System.out.println("The number is a palindrome.");
//         } else {
//             System.out.println("The number is not a palindrome.");
//         }
//     }
// }


// Program to find the Squre root 


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         double number = scanner.nextDouble();

//         double sqar = Math.sqrt(number);

//         if((sqar - Math.floor(sqar)) == 0){
//             System.out.println("Yes, the given number is a perfect square.");
//         }else{
//          System.out.println("Not, the given number is a perfect square.");
//         }

//     }
// }   
















































