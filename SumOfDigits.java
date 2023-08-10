package com.techzenure.services;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long sum = findSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " = " + sum);

        scanner.close();
    }

    public static long findSumOfDigits(long number) {
        long sum = 0;
        number = Math.abs(number);

        while (number > 0) {
            sum += number % 10; 
            number /= 10; 
        }

        return sum;
    }
}


	
		

