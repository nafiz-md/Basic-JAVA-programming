public class StringDemo3 {
    public static void main(String[] args){

        String country = "   Bangladesh     is my country    ";
        System.out.println(country);

        char ch = country.charAt(0);
        System.out.println(ch);

        int value = country.codePointAt(0);
        System.out.println("The value is "+value);

        int pos = country.indexOf("is");
        System.out.println("First position of n= "+pos);

        pos = country.lastIndexOf('n');
        System.out.println("Last position of n= "+pos);

        String s3 = country.trim();//from first and last
        System.out.println(s3);
    }
}