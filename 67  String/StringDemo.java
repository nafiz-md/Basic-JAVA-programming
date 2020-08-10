public class StringDemo {
    public static void main(String[] args){
        String s1="Anisul Islam";
        String s2 = new String("anisul Islam");///////////////////

        System.out.println(s1);
        System.out.println(s2);

        char[] s3 = {'a','e','i','o','u'};//////////////////////
        System.out.println(s3);

        int len = s1.length();
        System.out.println("Length of s1 is "+len);

        if(s1.equals(s2))   //if(s1.contains(s2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");

        if(s1.equalsIgnoreCase(s2))  // here upper and lower case is not ignored
            System.out.println("Equals");
        else
            System.out.println("Not Equals");

        boolean con=s1.contains("anis");//boolean con=s1.equals("anis");
            System.out.println(con);

        boolean b = s1.isEmpty();
            System.out.println(b);
    }
}