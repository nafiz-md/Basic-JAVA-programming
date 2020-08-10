public class WrapperDemo {
    public static void main(String[] args){

        //AutoBoxing:
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("Y: "+y);

        Integer z = x;  //Integer.valueOf(x) autoboxing
        System.out.println("z: "+z);


        // Unboxing:
        Double d = new Double(10.25);
        System.out.println("\nd: "+d);

        double e = d.doubleValue();       //double e = d;
        System.out.println("e: "+e);


    }
}

// Autoboxing = converting primitive to obj.
// Unboxing = converting obj to primitive.