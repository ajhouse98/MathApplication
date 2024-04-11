package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: Who has the highest salary?

        // declare variables here
        int bobSalary = 8100, garySalary = 200;

        // then code solution
        int highestSalary = Math.max(bobSalary, garySalary);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The Highest Salary is " + highestSalary);


        // Q2: Find and display the smallest of two variables named carPrice and truckPrice?
        int carPrice = 35000, truckPrice = 70000;

        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is " + lowestPrice);


        // Q3: Find and display the area of a circle whose radius is 7.25

        double radius = 7.25f;
        double area = Math.PI * radius * radius;
        System.out.println("Area of a circle is " + area);

        // Q4: Find and display the square root a variable after it is set to 5.0

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square roof of " + number + " is: " + squareRoot);




    }
}