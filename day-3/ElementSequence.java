package com.techzenure.services;
public class ElementSequence {
    public static void main(String[] args) {
        int firstElement = 1;
        int commonDifference = 3; 
        int numberOfElements = 15;

        System.out.println("The first " + numberOfElements + " elements of the sequence:");
        displaySequence(firstElement, commonDifference, numberOfElements);
    }

    public static void displaySequence(int firstElement, int commonDifference, int numberOfElements) {
        int currentElement = firstElement;
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(currentElement + " ");
            currentElement += commonDifference;
        }
    }
}

