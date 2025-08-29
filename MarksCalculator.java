/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package markscalculator;

import java.util.Scanner;

public class MarksCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++)
        {
            System.out.print("Enter marks of subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double average = (double) total / subjects;

        char grade;

        if (average >= 90)
        {
            grade = 'A';
        }
        else if (average >= 75)
        {
            grade = 'B';
        }
        else if (average >= 50)
        {
            grade = 'C';
        }
        else if (average >= 35)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}