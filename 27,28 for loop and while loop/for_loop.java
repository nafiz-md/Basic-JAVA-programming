
/*
public class for_loop {

    public static void main(String[] args){

        for(int i = 1; i<=10; i++)
                     System.out.println(i);
    
       // System.out.println("Agai");
        
        int j = 1001;
                    while(j<=1020){
                    System.out.println(j+ " Bangladesh");
                    j = j+2;
        }
    }
}
*/


import java.util.Scanner;
public class for_loop {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        for(int i = 1; i<=10; i++)
                     System.out.println(i);
    

            System.out.println("Start your number:");
                int j = obj.nextInt();


                    while(j<=1020){
                    System.out.println(j+ " Bangladesh");
                    j = j+2;
        }
    }
}