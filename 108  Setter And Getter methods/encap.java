public class encap {
    
   private String name;
   private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;  //here didn't use this keyword. 
    }
    public int getAge(){
        return age;
    }
}






//Pakaging variables and methods into a single unit.
//Protecting data by declaring them as private

/*
private data will be hidden from other classes and they can only be 
accessed through the methods of their current class. Called as data hiding.
*/