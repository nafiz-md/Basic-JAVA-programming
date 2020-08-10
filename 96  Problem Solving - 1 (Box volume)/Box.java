public class Box {
    double height, width, depth;

    Box(double height, double width, double d){

        this.height = height; //97 : Instance Variable Hiding
        this.width = width;   //Instance Variable Hiding
        depth = d;
    }

    void displayVol(){
        double vol = height*width*depth;//Formula of Box volume
        System.out.println("Volume of Box: "+vol);
    }
}