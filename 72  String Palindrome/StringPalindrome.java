public class StringPalindrome {
    public static void main(String[] args){
        String s1 = "MadaM";

        StringBuffer sb  = new StringBuffer(s1);

       // sb.reverse();
        String s2 = sb.reverse().toString();

        if(s1.equals(s2))
        System.out.println("Palindrone");
        else
        System.out.println("Not a palindrone");

    }
}
/*
1.String Buffer is less efficient and slower than String Builder.

2.StringBuffer is synchronized thread safe. 
It means two threads can't call the methods of StringBuffer simultaneously.
*/