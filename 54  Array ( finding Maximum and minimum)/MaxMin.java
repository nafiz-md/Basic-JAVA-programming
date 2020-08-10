import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        double[] num = new double[5];
        double sum = 0;

        System.out.println("Enter 5 numbers: \n");

        for(int i =0;i<num.length;i++){           //input nilam
            num[i] = obj.nextDouble();
        }

        double max = num[0];
        double min = num[0];

        for(int i=1;i<num.length;i++){
            if(max<num[i]){
                max = num[i];
            }

            if(min>num[i]){
                min=num[i];
            }
        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

        
    }
}