import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        
        LinkedList<Student> list = new LinkedList<Student>();

        Student s1= new Student(101, "Karim","Eleven");
        Student s2= new Student(102, "Kabil","Eleven");
        Student s3= new Student(103, "Habil","Eleven");


        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(Student s: list){

            System.out.println("Id no: "+s.id+" Name: "+s.name+" Class: "+s.ClassName);
            
        }
        

    }
}











//TestDemo for Student List