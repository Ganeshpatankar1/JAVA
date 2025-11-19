package Condition;

import java.util.Scanner;

class evenNo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Number : ");
            int n = sc.nextInt();
            if(n % 2 == 0){
                System.out.println("Is even");
            } else {
                System.out.println("Is Odd");
            }
            sc.close();
        }
}
