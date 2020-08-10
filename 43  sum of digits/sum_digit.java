import java.util.Scanner;
public class sum_digit{
	
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		int sum = 0, temp;//
		System.out.println("Enter any number:");
		int num = obj.nextInt();

		temp = num;

		while(temp != 0)
		{
			int r= temp%10;
			sum=sum+r;
			temp = temp/10;
		}

		System.out.println("So the result is "+sum);

	}
}