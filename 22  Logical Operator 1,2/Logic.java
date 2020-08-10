import java.util.Scanner;


public class Logic {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any letter: ");
        char ch = scan.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Vowel");
        }
        
        else{
            System.out.println("Constant");
        }

    }
}