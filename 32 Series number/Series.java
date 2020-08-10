import java.util.Scanner;

public class Series {

     private static Scanner puti;

    public static void main(String[] args) {
       
        puti = new Scanner(System.in);
        int sum = 1;

        System.out.println("\nEnter the last number: ");
        int n = puti.nextInt();

        for(int i = 1; i<=n; i=i+1)
        {
            System.out.print(i+ " ");
            sum = sum * i;
        }
       // System.out.println();
        System.out.print("= "+sum);
        System.out.println("\nThe " +n+ "! result is " +sum);
    }
}