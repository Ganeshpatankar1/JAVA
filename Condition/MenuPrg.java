package Condition;
import java.util.Scanner;

public class MenuPrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;  // declare outside loop

        do { 
            System.out.println("===== Menu =====");    
            System.out.println("1. Check even/odd");    
            System.out.println("2. Factorial");    
            System.out.println("3. Reverse Number");    
            System.out.println("4. Exit");    
            System.out.print("Enter Choice : ");

            choice = sc.nextInt(); // input here

            switch(choice){

                case 1:
                    System.out.print("Enter a Number : ");
                    int n = sc.nextInt();
                    if(n % 2 == 0) 
                        System.out.println("Even Number");
                    else 
                        System.out.println("Odd Number");
                    break;

                case 2:
                    System.out.print("Enter a Number : ");
                    int f = sc.nextInt();
                    int fact = 1;
                    for(int i = 1; i <= f; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial = " + fact);
                    break;

                case 3:
                    System.out.print("Enter a Number : ");
                    long num = sc.nextLong();
                    long rev = 0;
                    while(num > 0) {
                        rev = rev * 10 + num % 10;
                        num /= 10;
                    }
                    System.out.println("Reverse = " + rev);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
