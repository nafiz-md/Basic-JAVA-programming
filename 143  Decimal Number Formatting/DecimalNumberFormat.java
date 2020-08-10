import java.text.DecimalFormat;

public class DecimalNumberFormat {
    public static void main(String[] args) {
        
        double x = 2.9875822;
        System.out.printf("x = %.2f",x);   //C programming system.

        DecimalFormat obj= new DecimalFormat("0.000");
        double num = 3.5856651652652562626;
        System.out.println("\nnum = "+obj.format(num));
        
        
    }
}