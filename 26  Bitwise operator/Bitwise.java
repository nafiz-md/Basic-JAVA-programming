/*
https://bit.ly/2ZZgj73 
*/

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any digit: ");
        int num1= scan.nextInt();
        int num2 = scan.nextInt();

        int la = num1 & num2;
        System.out.println("num1 & num2: "+la);

        la = num1 | num2;
        System.out.println("num1 | num2: "+la);

        la = num1 ^ num2;
        System.out.println("num1 ^ num2: \n\n"+la);

        la = num1 >> 3;
        System.out.println("num1 >> 3: "+la);

        la = num1 << 3;
        System.out.println("num1 << 3: "+la);


    }
}