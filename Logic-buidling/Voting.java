// Implement a code that determines if a person is eligible to vote based on their age.

import java.util.Scanner;

public class Voting{
    public static void main(String args[]) {
        int maxvot = 18;
        

     Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int vot = sc.nextInt(); 
       
      if(vot>= maxvot){
          System.out.print("You are alegiable for vot");
      }else{
            System.out.print("You are not alegiable for vot");
      }
     
        
    }
}
