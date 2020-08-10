import java.util.Formatter;
import java.util.Scanner;


public class FileWriteDemo{
    public static void main(String[] args) {

        String id, name;
        
        try {
            
            Formatter objfor = new Formatter("G:/JAVA Youtube learning/Part- 08/151  How to create a file or directory/Person/Student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many student: ");
            int num = input.nextInt();

            for(int i = 1;i<=num;i++){
                System.out.println("Enter Student id and name:");
                id = input.next();
                name = input.next();

                objfor.format("%s %s\r\n",id,name);
                
            }
            
            //objfor.format("%s %s\r\n","101","Puti");
            //objfor.format("%s %s\r\n","102","Nabila");
           //objfor.format("%s %s\r\n","105","Nafiz");

            objfor.close();
            
        } 
        catch (Exception e) {
          
            System.out.println(e);
            
        }
    }
} 