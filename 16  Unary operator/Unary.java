public class Unary {
    public static void main(String[] args){




            /*int x = -10;
            int result;

            result = +x;
            System.out.println("result: "+result);

            result = -x;
            System.out.println("result: "+result);
            */


            int x = 25;
            int y;

            y = --x;
            System.out.println("y: "+y);  //24

            y = x--;
            System.out.println("y: "+y); //

            y =++x;
            System.out.println("y:"+y);

            y = x++;
            System.out.println("y: "+y);
    }
}