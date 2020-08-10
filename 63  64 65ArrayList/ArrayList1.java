
/*
import java.util.ArrayList;

public class ArrayList1 {
    public  static void main(String[] args){

        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("SIZE= "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(3,50);
        System.out.println(number);
        System.out.println("SIZE= "+number.size());// size is 5.
        
    }
}
*/

import java.util.ArrayList;

public class ArrayList1 {
    public  static void main(String[] args){

        ArrayList<Integer>number = new ArrayList<Integer>();
        System.out.println("SIZE= "+number.size());

        //adding elements
       number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(3,50);// Index no 3 will be 50.
        //number.addAll(10,20,30),
        System.out.println(number);
     /*   
        for(Integer x: number){
            System.out.println("No: "+number);
        }  
     */   
      
        System.out.println("SIZE= "+number.size());                      // size is 5.





        System.out.print("\n\n\n");





       // number.clear();
         //   System.out.println("After clear ArrayList contains: "+number);

        boolean check = number.isEmpty();//////////////
            System.out.print("ArrayList:"+check+"\n");
        
        boolean con = number.contains(30);/////////////////
            System.out.print("The result is "+con);

        int pos = number.indexOf(50);///////////////
            System.out.print("\nThe index of 40 is: "+pos);

        number.set(3, 70); //replace ///////////////////
            System.out.println("\nAfter setting:"+number);

        int x_get = number.get(0); ////////////////
            System.out.print("THE INDEX IS "+x_get);





        
    }
}