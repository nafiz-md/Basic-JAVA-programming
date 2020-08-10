public class Overloading {
    String name, gender;
    int phone;

    Overloading(){
        System.out.println("\n------No value-----------");
    }

    Overloading(String n, String gen){
        name = n;
        gender = gen;
    }
    Overloading(String n, String gen,int ph){
        name = n;
        gender = gen;
        phone = ph;
    }

    void initComponent(){
        System.out.println("\nName: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone no: "+phone);
    }
}