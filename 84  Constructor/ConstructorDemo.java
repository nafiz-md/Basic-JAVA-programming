public class ConstructorDemo {
    String name, gender;
    int phone;

    ConstructorDemo(String n, String gen, int ph){
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