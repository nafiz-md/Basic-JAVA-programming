public class Car extends Vehicle{
    
    int gear;

    Car(String co, double wei, int ge){

        super(co,wei);//Calling the constructor of Vehicle class
        gear = ge;
    }

    void attribute(){
       super.attribute();//Calling--------------------
        System.out.println("Gear: "+gear);
        
    }
}