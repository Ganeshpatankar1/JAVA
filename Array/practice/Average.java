package practice;

public class Average {
    public static void main(String[] args) {
        float[] num = {43.4f,23.4f,23.5f,23.5f,56.2f,23.6f};
        float sum = 0;
        for(float ele : num){
            sum = sum + ele;
        }
        System.out.println("The Value Of Average Of Num : " + sum/num.length);
    }
}
