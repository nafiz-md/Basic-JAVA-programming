


import java.util.Scanner;


public class Control_Statement {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int num = scan.nextInt();

        if(num>0)
        {
            System.out.println("Positive");
        }
        else if (num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to 0");
        }

    }
}
