

public class Demo {
    public static void main(String[] args) {

        Person p = new Teacher(); //Upcasting
        p.display();

        //super class obj ke sub class obj rakha jabe na
    //    Teacher t = (Teacher)new Person();//Downcasting not allowed
   //     t.display();



        //type casting(int to double)
        int x1 = 35;
        double y1= 15;
        System.out.println(y1);  


        //type casting(double to int)
        double y = 10.5;
        int x = (int) y;
        System.out.println(x);   
 
        
    }
}

//JAVA doesn't support Downcasting