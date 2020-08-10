public class toStringMethod {

    String name;
    int age;

    toStringMethod(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String toString() {

        return "Name: " + name + "\nAge: " +age;
        
    }
    
}