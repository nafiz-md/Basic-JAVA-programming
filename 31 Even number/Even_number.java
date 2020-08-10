import java.util.Scanner;

public class Even_number {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int n = scan.nextInt();

        System.out.println("Enter the last number:");
        int m = scan.nextInt();

        int sum = 0;
        for(int i =n; i<=m; i++){
           sum = sum + i;
        }
        System.out.println("The sum is: "+sum);






        
        System.out.println("Even number:");

        System.out.println("Enter the first number:");
        int x = scan.nextInt();

        System.out.println("Enter the last number:");
        int y = scan.nextInt();

        int sumxy = 0;
        for(int j =x; j<=y; j++){
            if(j%2==0){
                sumxy = sumxy + j;
                System.out.print(" "+j);
            }
          // sumxy = sumxy + j;
        }
        System.out.println();
        System.out.println("The even sum is: "+sumxy);
    }
}