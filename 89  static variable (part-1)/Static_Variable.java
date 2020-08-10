public class Static_Variable {
    String name;
    long id;
    static String varsityName = "Jiangxi University of Science and Technology";

    Static_Variable(String n, long roll){
        name = n;
        id = roll;
    }
    
    void initComponent(){
        System.out.println("\nName: "+name);
        System.out.println("Id no: "+id);
        System.out.println("University name: "+varsityName);

        System.out.println();
    }
}







//Static keyword is used for memory management.
// It makes the program more effcient by saving memory.
// Static variable is not related to obj; it is related to class.