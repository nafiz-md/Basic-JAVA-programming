import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){

        Random randobj = new Random();

        int randomNumber = randobj.nextInt(5);//0 to 4
        System.out.println(randomNumber);
        randomNumber = randobj.nextInt(91) + 10;//10 to 100
        System.out.println(randomNumber);

        randomNumber =(int)(Math.random()*10);//0 to 9
        System.out.println(randomNumber);
        randomNumber =(int)(Math.random()*100)+1;//1 to 100
        System.out.println(randomNumber);
    }
}