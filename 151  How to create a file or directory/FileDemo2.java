import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {

        File file1 = new File("G:/JAVA Youtube learning/Part- 08/151  How to create a file or directory/Person/Student.txt");
        File file2 = new File("Teacher.txt");

    try {
        file1.createNewFile();
        file2.createNewFile();
        System.out.println("Files are created");
        
    } 
    
    catch (Exception e) {

            System.out.println(e);
            
    }

    file2.delete();

    if(file1.exists()){
        System.out.println("File exists");
    }
    else{
        System.out.println("File does not exist");
        
    }
        
    }

    }
    
    