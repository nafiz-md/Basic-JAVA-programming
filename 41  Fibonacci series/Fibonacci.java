
import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("How many number:");
		int how_many = obj.nextInt();

		int first =0;
		int last =1;
		int fibo;
		System.out.println(first+"\n"+last);
		for(int i = 3;i<10;i++)
		{
			fibo = first+last;
			System.out.println(" "+fibo);
			first = last;
			last = fibo;
			System.out.println();

		}

	}
}
