import java.util.Scanner;


public class CapitalSmall {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any alphabet: ");
        char ch = scan.next().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("small letter");
        }

        else if (ch>='A' && ch<='Z'){
            System.out.println("CAPITAL LETTER");
        }
        
        else{
            System.out.println("--------------");
        }

    }
}