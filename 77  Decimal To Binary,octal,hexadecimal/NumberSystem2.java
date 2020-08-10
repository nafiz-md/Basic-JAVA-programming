import java.util.Scanner;

public class NumberSystem2 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        String binary = obj.nextLine();

        Integer decimal = Integer.parseInt(binary,2);
        System.out.println("The Binary value is "+decimal);

        //Integer Octal = Integer.parseInt(octal,8);
        //System.out.println("The Octal value is "+Octal);



    }
}

//Binary, octal, hexadecimal to Decimal