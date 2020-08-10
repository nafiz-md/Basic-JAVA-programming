public class CallByValueTest {
    public static void main(String[] args) {
        
        CallByValue obj = new CallByValue();
        int x = 30;        //primitive data
        System.out.println("x before call: "+x);

        obj.change(x);
        System.out.println("x after call: "+x); 
        
    }
}