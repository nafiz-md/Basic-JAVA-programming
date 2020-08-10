import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        
        try {
            File demo = new File("G:/JAVA Youtube learning/Part- 08/151  How to create a file or directory/Person/Student.txt");

            Scanner input = new Scanner(demo);

            while(input.hasNext()){
                String id = input.next();
                String name = input.next();
                System.out.println("Id: "+id+" Name: "+name);
                
                
            }

            input.close();
        } 
        
        catch (Exception e) {
           
            System.out.println(e);
            
        }
    }
}