/*
import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.println("Enter 5 numbers: ");
        number[0] = obj.nextDouble();
        number[1] = obj.nextDouble();
        number[2] = obj.nextDouble();
        number[3] = obj.nextDouble();
        number[4] = obj.nextDouble();
        
        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("The SUM is "+sum);
    }
}
    
*/

import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.println("Enter 5 numbers: ");
        
        for(int i =0;i<number.length;i++)
        {
            number[i] = obj.nextDouble();
        }
        
        for(int i =0;i<5;i++){
            sum = sum+ number[i];  //sum = number[0] + number[1] + number[2] + number[3] + number[4];
        }
       

        System.out.println("The SUM is "+sum);
        System.out.println("The average is "+(sum/5));
        System.out.println("The average is "+(sum/number.length));//just modified
    }
}


