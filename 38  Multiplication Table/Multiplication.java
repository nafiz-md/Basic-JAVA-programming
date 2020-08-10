
/*
import java.util.Scanner;
public class Multiplication{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any number:");
		int num = obj.nextInt();
	

		for(int i =1; i<=10;i++)
		{
			System.out.println(num+ "X" +i+"  ="+num*i);
			//5 X 1 = 5
		}
	}
}
*/
import java.util.Scanner;
public class Multiplication{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any number:");
		int num = obj.nextInt();
		System.out.println("Enter last number:");
		int num2 = obj.nextInt();

		for(int i =num; i<=num2;i++)
		{
			for(int j = 1; j<=10;j++)
			{
				System.out.println(i+ "X" +j+"  ="+j*i);
			}
			System.out.println("\n\n\n");
			//5 X 1 = 5
		}
	}
}