public class prg1 {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,8,7};
        //finde max and min
        int max = arr[0];
        int min = arr[0];
        long sum = 0; // use long to avoid overflow for large value
        for(int v : arr){
            if(v > max) max = v;
            if(v < min) min = v;
            sum += v;

         }
         double avg = (double)sum / arr.length;

         System.out.println("Max Value : " + max);
         System.out.println("Min Value : " + min);
         System.out.println("Min Avg : " + avg);
    }
}
