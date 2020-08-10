public class Vehicle {
    
    String color;
    double weight;

    Vehicle(String co, double wei){
        color = co;
        weight = wei;
    }


    void attribute(){
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }
}