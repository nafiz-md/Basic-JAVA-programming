import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Here you can convert Decimal to Octal and Hex. Let's try---");
        System.out.println("Enter Decimal number:");
        int decimal = obj.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("The Binary value is "+binary);
        String oct = Integer.toOctalString(decimal);
        System.out.println("The Octal value is "+oct);



    }
}

/// ami pore octal or binary theke decimal convert janbo. INSHALLAH
// Allah kobul kore nilo
