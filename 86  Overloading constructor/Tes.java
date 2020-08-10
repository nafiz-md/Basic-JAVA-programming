import javax.swing.plaf.metal.OceanTheme;

public class Tes {
    public static void main(String[] args){

        Overloading obj_teacher = new Overloading();

        Overloading obj = new Overloading("Anisul Islam","Male",15789899);
        obj.initComponent();

        Overloading obj2 = new Overloading("Anisul Sir","Male");
        obj2.initComponent();
    }
}