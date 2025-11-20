import java.util.Scanner;
class stringDemo {

    public static void main(String[] args) {
        // String name = new String("Ganesh");

        String name = "Ganesh";
        System.out.print("The Name is : ");
        int a=6;
        float b=5.45f;
        System.out.printf("The Value Of a  is %d and Value od b is %f ", a, b);
        System.out.format("The Value Of a  is %d and Value od b is %f ", a, b);
        // System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}
