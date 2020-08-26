

public class StaticBlock {
    static int id;
    static String name;

    static{
        id = 1001;
        name = "Puti";
    }

    static void display(){

        System.out.println("Name: "+name);
        System.out.println("Id no: "+id);
    }
}
//This file


/*
public class StaticBlock {
    static int id;
    static String name;

    static{
        id = 1001;
        name = "Puti";
    }

    static void display(){

        System.out.println("Name: "+name);
        System.out.println("Id no: "+id);
    }

    public static void main(String[] args) {
        StaticBlock.display();
    }
}
*/



/*
public class StaticBlock {
   

    static{
       System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main method");
        
    }

       
    }

*/
