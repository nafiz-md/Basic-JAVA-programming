public class Person {
    
    String name;
    int age;
    String hairColour;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, String hairCol){

        this(name,age);
        hairColour = hairCol;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hair color: "+hairColour);
    }
}