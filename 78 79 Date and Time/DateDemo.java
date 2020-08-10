import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateDemo {
    public static void main(String[] args){
      
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("The current date is "+currentDate);



    }
}
