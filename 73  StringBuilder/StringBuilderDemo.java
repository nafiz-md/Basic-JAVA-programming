public class StringBuilderDemo {
    public static void main(String[] args){

        StringBuilder str = new StringBuilder("Nafiz");
        System.out.println("1. Str = "+str);

        str.append(" Imtiaz");////////////////////////////////////////////////
        str.append(" "+20);
        str.append(" "+12.5);
        System.out.println("2. Str = "+str);

       // str.reverse();
        //System.out.println("3. Str = "+str);

        str.delete(2, 5);                     ///////////////////////////
        System.out.println("4. Str = "+str);


    }
}