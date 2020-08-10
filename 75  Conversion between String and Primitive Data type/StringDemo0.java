import java.security.Principal;

public class StringDemo0 {
    public static void main(String[] args){

        //Primitive data type to String:
        int i = 100;
        String sb = Integer.toString(i);
        System.out.println("a--> "+sb );

        boolean b = true;
        String sb1 = Boolean.toString(b);
        System.out.println("b--> "+sb1 );


        //String to Pritive data type:
        String s = "33";
        int j = Integer.parseInt(s);
        System.out.println("c--> "+j);

        System.out.println();

        String sk = "39";
        int k = Integer.valueOf(sk);
        System.out.println("d--> "+k);

    }
}

int decimal = 10;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
        String hexa = Integer.toHexString(decimal);
        System.out.println(hexa);