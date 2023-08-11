package com.techzenure.services;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many odd numbers to be generated: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            displayOddNumbers(n);
        }

        scanner.close();
    }

    public static void displayOddNumbers(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(count + " ");
            count += 2;
        }
    }
}


	

	
