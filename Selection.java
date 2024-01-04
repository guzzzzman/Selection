// Jose Guzman
// 24 September 2023
// Provide a weekly salary using if and else statements
// File Name: Selection.java
// To Compile: javac Selection.java
// To Run: java Selection

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours worked in a week: ");
        int hoursWorked = input.nextInt();

        double hourlyRate = 8.0; // Standard hourly rate
        double overtimeRate = 12.0; // Overtime rate per hour
        int regularHours = 40; // Regular working hours per week

        double weeklySalary;

        if (hoursWorked <= regularHours) {
            weeklySalary = hoursWorked * hourlyRate;
        } else {
            weeklySalary = (regularHours * hourlyRate) + ((hoursWorked - regularHours) * overtimeRate);
        }

        System.out.println("Weekly Salary: $" + weeklySalary);

        input.close();
    }
}

/*
Enter the number of hours worked in a week: 40
Weekly Salary: $320.0
*/