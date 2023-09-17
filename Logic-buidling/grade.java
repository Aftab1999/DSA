import java.util.Scanner;

public class grade {
    public static void main(String[] args){

        int totalmarks = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Marks: ");

        int mark = scanner.nextInt();
        String grade;

        if (mark >= 90 && mark <= 100) {
            grade = "A";
        } else if (mark >= 80 && mark < 90) {
            grade = "B";
        } else if (mark >= 70 && mark < 80) {
            grade = "C";
        } else if (mark >= 60 && mark < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("The grade for the mark " + mark + " is " + grade);
       

    }
}



