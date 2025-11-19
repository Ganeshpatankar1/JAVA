package Condition;

import java.util.Scanner;

public class switchPrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First No : ");
        int a = sc.nextInt();
        System.out.print("Enter Second No : ");
        int b = sc.nextInt();

        System.out.println("Choose a Operation :");
        System.out.println("1. Addition");
        System.out.println("2. Multiple");
        System.out.println("3. Division");
        System.out.println("4. Substract");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result = " + (a+b)); break;
            case 2: System.out.println("Result = " + (a*b)); break;
            case 3: System.out.println("Result = " + (a/b)); break;
            case 4: System.out.println("Result = " + (a-b)); break;
        
            default: System.out.println("Invalid Operation"); break;
        }
        sc.close();
    }
}
