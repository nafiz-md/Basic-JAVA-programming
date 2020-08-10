import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args){
        ArrayList<Integer>num1 = new ArrayList<>();
        ArrayList<Integer>num2 = new ArrayList<>();
        ArrayList<Integer>num3 = new ArrayList<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);

        System.out.print("\nArrayList1:"+num1);
        
        num2.add(1);
        num2.add(2);
        num2.add(3);

        System.out.print("\nArrayList2:"+num2);




        num3.addAll(num1);
        System.out.print("\nThe addAll result is :"+num3);

        boolean result=  num1.equals(num2);
        System.out.print("\n num1==num2: "+result);
        
        boolean result1=  num3.equals(num1);
        System.out.print("\n num1==num2: "+result1);
    }
}