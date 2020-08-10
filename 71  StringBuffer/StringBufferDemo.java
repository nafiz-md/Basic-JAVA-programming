public class StringBufferDemo {
    public static void main(final String[] args) {

        StringBuffer sb=new StringBuffer("Hello "); 
        System.out.println(sb); //1 no
        sb.insert(1,"Java");//now original string is changed  
        System.out.println(sb);//prints HJavaello    // 2 no

        sb.append(" Islam ");
        sb.append(25);
        System.out.println(sb);  //3 no

        sb.reverse();
        System.out.println(sb);  //4 n0

        sb.delete(0, 5);
        System.out.println(sb);   //5 no

        sb.setLength(5);
        System.out.println(sb);
    }
}