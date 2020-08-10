import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int[][] num = new int[2][3];

        System.out.println("Enter :");

        for (int row = 0; row < num.length; row++) {

            for (int col = 0; col < 3; col++) {

                num[row][col] = obj.nextInt();
            }
        }

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + num[row][col]);
            }
            System.out.println();
        }
    }
}