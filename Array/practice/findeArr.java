package practice;

public class findeArr {
     public static void main(String[] args) {
        float[] marks={43.2f,32.2f,34.5f,23.3f,21.3f,12.3f};
        float num=23.3f;
        boolean isInArray = false;
        for(float ele : marks){
            if(num == ele){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The Value In Present in the Array");
        } else{
            System.out.println("The Value is not Present in the Array");
        }
    }
}
