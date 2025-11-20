public class DemoTwo {
    public static void main(String[] args) {

        /* float[] markss = {433,42,43,23,53,43};
        String[] st = {"Ganesh","Smarthh", "Satish","Shubham"};
        System.out.println(st.length);
        System.out.println(markss[2]); */
        

        int[] marks = {433,42,43,23,53,43};
        System.out.println("Order");
        for(int i=0; i<=marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Reverse Order");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println(marks.length);
    }
}
