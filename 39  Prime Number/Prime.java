
/*
import java.util.Scanner;
public class Prime{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any positive integer:");
		int num = obj.nextInt();

		int count=0;
		for(int i = 2;i<num;i++)
		{
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime");
	}
}

*/

import java.util.Scanner;
public class Prime{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		int count = 0,total_prime=0;
		System.out.println("Enter any positive integer:");
		int m = obj.nextInt();
		System.out.println("Enter last integer:");
		int n = obj.nextInt();

		for(int i=m;i<=n;i++)
		{
			for(int j =2;j<i-1;j++)
			{
				if(i%j==0)
					{
						count++;
						break;
					}
			}
			if(count==0)

				{
					System.out.println(i);
					total_prime++;
				}

			count=0;
		}
		System.out.println("Total Prime number: "+total_prime);
	
	}
}