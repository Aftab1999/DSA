import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] studentIds = new int[100]; // Assuming a maximum of 100 students
        String[] studentNames = new String[100];
        int[][] grades = new int[100][5]; // Assuming 5 subjects and a maximum of 100 students
        int studentCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Gradebook Manager!");

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add a new student");
            System.out.println("2. Enter grades for a student");
            System.out.println("3. Calculate average grade for each student");
            System.out.println("4. Search for a student");
            System.out.println("5. Sort students by average grade");
            System.out.println("6. Display class summary");
            System.out.println("7. Exit");

            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student identifier (e.g., roll number): ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    studentIds[studentCount] = id;
                    studentNames[studentCount] = name;
                    studentCount++;
                    System.out.println("Student with identifier " + id + " added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student identifier: ");
                    int studentId = scanner.nextInt();
                    int studentIndex = -1;
                    for (int i = 0; i < studentCount; i++) {
                        if (studentIds[i] == studentId) {
                            studentIndex = i;
                            break;
                        }
                    }
                    if (studentIndex != -1) {
                        System.out.print("Enter subject index (1-5): ");
                        int subjectIndex = scanner.nextInt() - 1;
                        System.out.print("Enter grade for subject " + (subjectIndex + 1) + " (0-100): ");
                        int grade = scanner.nextInt();
                        grades[studentIndex][subjectIndex] = grade;
                        System.out.println("Grades for student " + studentId + " added successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
               
                    case 3:
                    System.out.print("Enter student identifier: ");
                    int avgStudentId = scanner.nextInt();
                    int avgStudentIndex = -1;
                    for (int i = 0; i < studentCount; i++) {
                        if (studentIds[i] == avgStudentId) {
                            avgStudentIndex = i;
                            break;
                        }
                    }
                    if (avgStudentIndex != -1) {
                        double averageGrade = 0;
                        int totalGrades = 0;
                        int subjectCount = 0;
                        for (int i = 0; i < grades[avgStudentIndex].length; i++) {
                            if (grades[avgStudentIndex][i] != 0) {
                                totalGrades += grades[avgStudentIndex][i];
                                subjectCount++;
                            }
                        }
                        if (subjectCount != 0) {
                            averageGrade = (double) totalGrades / subjectCount;
                        }
                        System.out.println("Average grade for student " + avgStudentId + ": " + averageGrade);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
               
                
                    case 4:
                    System.out.print("Enter student identifier to search: ");
                    int searchId = scanner.nextInt();
                    int searchIndex = -1;
                    for (int i = 0; i < studentCount; i++) {
                        if (studentIds[i] == searchId) {
                            searchIndex = i;
                            break;
                        }
                    }
                    if (searchIndex != -1) {
                        System.out.println("Student with identifier " + searchId + " found.");
                        System.out.println("Name: " + studentNames[searchIndex]);
                        System.out.println("Grades:");
                        for (int i = 0; i < grades[searchIndex].length; i++) {
                            if (grades[searchIndex][i] != 0) {
                                System.out.println("Subject " + (i + 1) + ": " + grades[searchIndex][i]);
                            }
                        }
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                
                   
                    case 5:
                    System.out.println("Sorting feature not available in this version.");
                    break;

                    case 6:
                    System.out.println("Thank you for using the Gradebook Manager!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }

            System.out.print("Do you want to perform another action? (yes/no): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the Gradebook Manager!");
                break;
            }
        }
    }
}
