

public class TestMethod {
    public static void main(String[] args){

        //no static
        StaticMethod obj1 = new StaticMethod();
        obj1.display1();  

        System.out.println();

        //With static
        StaticMethod.display2();

    }
}