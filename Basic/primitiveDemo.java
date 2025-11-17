class primitiveDemo{
    public static void main(String[] args){
        byte b =10;
        short s = 32000;
        int i = 2_000_000_000;
        long l = 9_000_000_000L;    //not L Suffix
        float f = 3.14f;            //F suffix required
        double d = 3.141592653589793;
        char c = 'A';
        boolean bool = true;

        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d);
        System.out.println(c + " " + bool);

    }
}