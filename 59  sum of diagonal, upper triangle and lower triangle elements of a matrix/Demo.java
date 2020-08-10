
import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        int[][] A =new int[3][3];

        System.out.println("Enter number:");

        //Matrix input
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                A[row][col]= obj.nextInt();
            }
        }
        int sumofDiagonal =0;
        int sumofUpper =0;
        int sumofLower =0;

        //Diagonal,upper,Lower
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){

                if(row==col)
                    sumofDiagonal+=A[row][col];
                if(row<col)
                    sumofUpper+=A[row][col];
                if(row>col)
                    sumofLower+=A[row][col];
                }
            
        }

        System.out.println("Sum of diagonal Element: "+sumofDiagonal);
        System.out.println("Sum of Upper Element: "+sumofUpper);
        System.out.println("Sum of Lower Element: "+sumofLower);
    }
}


