import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int[] number = {10,-56,45,-6,4};

        Arrays.sort(number);

        System.out.print("Ascending: ");

        for(int i=0;i<5;i++){
            System.out.print(" "+number[i]);
        }
        
        System.out.println("");

        System.out.print("Decending: ");
        for(int i=4;i>=0;i--){
            System.out.print(" "+number[i]);
        }
       
    }
}