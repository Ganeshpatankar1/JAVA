class MultidArr{
    public static void main(String[] args) {
        int[] marks; //1-d arr
        int[][] flat;   //2d-arr

        flat = new int[2][3];
        flat[0][0] =100;
        flat[0][1] =101;
        flat[0][2] =102;
        flat[1][0] =200;
        flat[1][1] =201;
        flat[1][2] =202;

        System.out.println("Printing 2-D Array using loop");
        for(int i=0; i<flat.length; i++){
            for(int j=0; j<flat[i].length; j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}