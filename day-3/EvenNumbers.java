package com.techzenure.services;
import java.util.Scanner;

public class  EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the last number: ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(" Invalid Input:: second number should be greater than first number\r\n"+ " ");
        } else {
            System.out.println("Even numbers between " + x + " and " + y + " are:");
            displayEvenNumbers(x, y);
        }

        scanner.close();
    }

    public static void displayEvenNumbers(int x, int y) {
        if (x % 2 != 0) {
            x++;
        }

        for (int i = x; i <= y; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



