import java.util.HashMap;

public class Demo {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> customer = new HashMap <Integer, String>();
        
        customer.put(101,"Nafiz");
        customer.put(102,"Nabia");
        customer.put(103,"Puti");
        customer.put(104,"Aniz");

        System.out.println(customer.get(103));

        System.out.println(customer);///////////////
        

    }
}