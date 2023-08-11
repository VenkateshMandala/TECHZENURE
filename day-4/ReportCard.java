package com.techzenure.services;
import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        if (!studentName.matches("^[a-zA-Z\\s]+$")) {
            System.out.println("Invalid student name. Please use only alphabets and spaces.");
            return;
        }

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;

        System.out.println("\nEnter marks for each subject:");
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject-" + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double average = (double) totalMarks / numSubjects;

        System.out.println("\nREPORT CARD\n");
        System.out.println("NAME: " + studentName + "\n");
        System.out.println("SUBJECT\nMARK");
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Subject-" + i + "\n" + "XX");
        }

        System.out.println("\nTOTAL: " + totalMarks);
        System.out.printf("AVERAGE: %.2f\n", average);
    }
}
