
import java.util.Scanner;

public class SumofDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int num = sc.nextInt();

        int sum = 0;  //result store

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println("Sum of Digit " + sum);
    }
}
