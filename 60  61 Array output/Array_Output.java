public class Array_Output {
     public static void main(final String[] args) {

         final int[][] number = new int[4][5];
        int k =0;
        
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                number[i][j] =  k;
                 k++;
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }

        
    }
}