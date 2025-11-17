public class Operator {
    public static void main(String[] args) {

        int a=10, b=45;

        //Arithmetic Operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
        
        System.out.println(" ");
        //Assignment Operator
        int x=10;
        x += 5;
        x -= 2;
        x *= 3;
        x /= 3;
        x %= 5;
        System.out.println(x);

        System.out.println(" ");
        
        //Relational Operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        
        System.out.println(" ");
        
        //Unary Operator
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        
        
        boolean flag = true;
        System.out.println(!flag);
        
        System.out.println(" ");
        
        //Unary Operator
        int age = 22;
        boolean hashId = true;
        
        
        System.out.println(" ");
        //Logical Operator
        System.out.println(age >= 25 || hashId);
        System.out.println(age >= 18 && hashId);
        System.out.println(!hashId);
        
        System.out.println(" ");
        
        //Bitwise Operator
        System.out.println(a^b);
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(~a);
        System.out.println(a>>1);
        System.out.println(a<<1);

    }
}
    