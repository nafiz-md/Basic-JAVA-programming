public class StringComparison {
    
    public static void main(String[] args) {
        
        String password1 = "boss123";
        String password2 = "boss123";
        String password3 = new String("boss123");
        String password4 = new String("boss123");

        System.out.println(password1==password2);
        System.out.println(password1==password3);
        System.out.println(password3==password1);
        System.out.println(password3==password4);

        System.out.println();

        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password1));
        System.out.println(password3.equals(password4));
        
   
        
    }
}