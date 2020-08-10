/*
public class foreachloop {
    public static void main(String[] args){

        String[] name = new String[4];

        name[0] = "Anid";
        name[1] = "AMir";
        name[2] = "Akah";
        name[3] = "Amir";

        for(int i =0;i<name.length;i++){
            System.out.println(name[i]);
        }

    }
}
*/
public class foreachloop {
    public static void main(String[] args){

        String[] name = {"Anid","AMir","Akah","Amir"};
        //int[] num = {42,58,78,25,48,47,85,78};

        System.out.println("Here length is "+name.length);
        //System.out.println(num.length);

        for(String x: name){
            System.out.println(x);
        }
       /* for(int n: num){
            System.out.println("\n"+n);
        }   */
    }
}