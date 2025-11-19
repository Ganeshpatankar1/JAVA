package Condition;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a Marks : ");
        int marks = sc.nextInt();

        if(marks > 100 && marks < 0) System.out.println("invalid Marks! Plese re-enter between 0-100"); 
        else if (marks >= 90) System.out.println("A+ Grade (Excellent)");
        else if (marks >= 80) System.out.println("Grade A (Very Good)");
        else if (marks >= 70) System.out.println("Grade B+ (Good)");
        else if (marks >= 60) System.out.println("Grade B (above Average)");
        else if (marks >= 50) System.out.println("Grade C (Average)");
        else if (marks >= 35) System.out.println("Grade D (Pass)");
        else System.out.println("Grade Fail");
        sc.close();
    }
}
