class sumOfarr {
    public static void main(String[] args) {
        float[] marks={43.2f,32.2f,34.5f,23.3f,21.3f,12.3f};
        float sum=0;
        for(float ele : marks){
            sum = sum + ele;
        }
        System.out.println("The value Of Sum " + sum);
    }
}
