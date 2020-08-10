
//import java.util.Scanner;

public class get_user_input {
    public static void main(String[] args){

        java.util.Scanner scan = new java.util.Scanner(System.in);
       

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Thanks "+name);

        System.out.print("Enter any integer value: ");
        int nu = scan.nextInt();
        System.out.println("Number: "+nu);

        
    }
}

