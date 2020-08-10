
/*
import java.util.Scanner;

public class pattern{
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter line number");
		int n = obj.nextInt();
		System.out.println();

		for(int row =1; row<=n;row++){
			for(int col = 1;col<=row;col++){
				System.out.println(" "+col);
			}
				System.out.println();
		}
	
	}
}
*/
import java.util.Scanner;

public class pattern{
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter line number");
		int n = obj.nextInt();
		System.out.println();

		for(int row =n; row>=1;row--){
			for(int col = 1;col<=row;col++){
				System.out.println(" "+col);
			}
				System.out.println();
		}
	
	}
}