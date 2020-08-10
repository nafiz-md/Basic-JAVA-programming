import java.util.Scanner;

public class ProblemDemo {

    public static void main(String[] args) {

        while(true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("\nPlease enter number num1: ");
                int num1 = input.nextInt();
                System.out.print("\nPlease enter number num2: ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.print("\nResult: " + num1 + "/" + num2 + " = " + result);
            }
     
            catch (Exception e) {
    
                System.out.print("\nException: "+e);
                System.out.print("\nYou must enter an integer. Please try again");
            }
           
        }

        
        

    }
}