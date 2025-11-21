class overloading{
    static int add(int a, int b){
        return a+b;

    }
    static double add(double a, double b){
        return a+b;

    }
    static String add(String a, String b){
        return a+b;
    }   
    public static void main(String[] args) {
        System.out.println(add(23, 43));
        System.out.println(add(54.3, 42.3));
        System.out.println(add("Ganesh ", " Patankar"));
    }
}