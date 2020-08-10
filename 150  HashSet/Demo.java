import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        
        HashSet <String> fruitName = new HashSet<String>();

        fruitName.add("Apple");
        fruitName.add("Mango");
        fruitName.add("Guava");
        fruitName.add("Jackfruit");
        fruitName.add("Banana");

        System.out.println(fruitName);
        System.out.println("Size: "+fruitName.size());

        fruitName.remove("Mango");
        System.out.println(fruitName);

        fruitName.clear();
        System.out.println(fruitName);

        boolean value = fruitName.isEmpty();
        System.out.println(value);
        
        
        
    }
}