public class Demo {
    
    public static void main(String[] args) {
        try {

            //int [] a = new int[4];
            // a[4] = 10;

            int x = 10;
            int y = 0;
            int result = x/y;
            System.out.println("Result: "+result);
        } 

        catch (ArithmeticException e1) {
            System.out.println("ArithmeticException: "+e1);
            
        }
        catch (Exception e2) {
            System.out.println("Exception: "+e2);
            
        }
        
        finally{
            System.out.print("Last line of the program");
        }
        
        
        
    }
}



//throw
//throws