import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {

        LinkedList<String> countryName = new LinkedList<String>();

        countryName.add("Afganistan");
        countryName.add("Bangladesh");
        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add("Nepal");
        countryName.add(3,"Brazil");
        countryName.addFirst("Sri Lanka");
        countryName.addLast("China");
        countryName.remove(3);
        countryName.removeLast();
        

        System.out.println("First element: "+countryName.getFirst());
        System.out.println("Last element: "+countryName.getLast());
        

        for(String country: countryName)
        {
            System.out.println(country);
        }

        System.out.println("Size of the list: "+countryName.size());

        countryName.clear();
        System.out.println(countryName);
        
        
        
        
    }
}