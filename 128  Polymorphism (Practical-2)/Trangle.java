public class Trangle extends Shape{

    double base, height;

    Trangle(double base, double height){
        this.base = base;
        this.height= height;
    }

    double area(){

        System.out.print("Traingle area: ");

        return 0.5*(base*height);
    }
}