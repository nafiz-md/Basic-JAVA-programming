import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args){
    	
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers for addition: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int resultadd = num1 + num2;
        System.out.println("Your addition result is "+resultadd);
    }
}