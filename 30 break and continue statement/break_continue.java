public class break_continue {
    public static void main(String[] args){

        for(int x = 1; x<=50;x++){
            if(x==10)
            break;
            System.out.println(x);
        }
        System.out.println();
        System.out.println();
        for(int y = 1; y<=50;y++){
            if(y==10)
            continue;
            System.out.println(y);
        }

    }
}