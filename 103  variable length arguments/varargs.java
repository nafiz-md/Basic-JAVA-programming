

public class varargs {
    
    void add(int ... num){
        int sum = 0;

        for(int x: num){
            sum+=x;
        }
        System.out.println(sum);
    }
   
}