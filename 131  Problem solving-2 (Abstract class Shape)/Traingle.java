public class Traingle extends Shape{
    
    Traingle(double dim1, double dim2){
        super(dim1,dim2);
    }

    void area(){
        double result = (1/2)*dim1 * dim2;
        System.out.println("Traingle area: "+result);
    }
}