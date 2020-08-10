import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any digit: ");
        int num1= scan.nextInt();
        int num2 = scan.nextInt();
        int large = (num1>num2)?num1:num2;
        System.out.println("Large number: "+large);
    }
}