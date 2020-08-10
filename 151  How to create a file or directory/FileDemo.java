import java.io.File;

public class FileDemo {
    
    public static void main(String[] args) {
        
        File dir = new File("Person");
        dir.mkdir();   //directory will be created

        File dir2 = new File("G:/JAVA Youtube learning/Part- 08/150  HashSet/Folder www");
        dir2.mkdir();   //directory will be created

        String loc=  dir2.getAbsolutePath();
        System.out.println(loc);
        System.out.println(dir.getName());
        
        if(dir2.delete()){
            System.out.println("folder has been deleted");
            
        }
        
        
    }
}