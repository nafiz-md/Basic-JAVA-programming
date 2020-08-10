public class Format_Specifier {
   public static void main(String[] args){
       boolean b = true;
       char c = 'a';
       short s = 32677;
       int i = 126587;
       float f = 10.2f;
       double d = 10.2;

       
       System.out.printf("Boolean: %b\n",b);
       System.out.printf("Character: %c\n",c);
       System.out.printf("Short: %d\n",s);
       System.out.printf("Integer: %d\n",i);
       System.out.printf("FLOAT: %5.2f\n",f);
       System.out.printf("Double: %lf\n",d);
   } 
}