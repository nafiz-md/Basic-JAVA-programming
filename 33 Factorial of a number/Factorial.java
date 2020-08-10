import java.util.Scanner;

public class Factorial{
    //private static Scanner sc;
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int fact =1;

        System.out.println("Enter any positive number:");
        int num = obj.nextInt();

        for(int i=num;i>=1;i--)
        {
           // int fact;
            fact = fact*i;
        }

        System.out.println("Factorial of " +num + " = "+fact);

    }
}
