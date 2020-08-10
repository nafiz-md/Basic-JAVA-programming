public class SquareDemo{
    public static void main(String[] args){
        ReturningDemo obj1 = new ReturningDemo();
        int result = obj1.square(5);
        System.out.println("\nThe sqaure result 5= "+result);

        ReturningDemo obj2 = new ReturningDemo();
        System.out.println("The sqaure result 25= "+obj2.square(25));
        
    }
}