public class StaticDemo {


    int x = 1000;
    
    void display1(){
        display2();  
        System.out.println("I am non static method");
        System.out.println(x);
    }

    static void display2(){

        System.out.println("I am static method");
        //System.out.println(x);   //it is not OK. it was non static variable
        

    }
}









//Static method cannot use non static member
// 'this' and 'super' keyword cannot be used here.