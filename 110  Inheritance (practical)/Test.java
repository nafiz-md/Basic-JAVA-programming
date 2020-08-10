public class Test {
    public static void main(String[] args) {
        

        Teacher t1 = new Teacher();
        t1.name = "Anisul Islam";
        t1.age = 30;
        t1.qualification = "BSc in LU";
        t1.initComponent2();

        Teacher t2 = new Teacher();
        t1.name = "\n";/////////////////////////////
        t1.name = "Anisul Sir";
        t1.age = 27;
        t1.qualification = "BSc ----------";
       
        t1.initComponent2();
    }
}