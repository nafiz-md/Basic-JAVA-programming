import java.util.Arrays;
public class String_Sorting {
    public static void main(String[] args){
        String[] name = {"Anis","Sujoy", "Milon","Abu"};

        Arrays.sort(name);

        System.out.println("Ascending: ");

        for(int i=0;i<5;i++){
            System.out.print(" "+name[i]);
        }
            
        System.out.println();

            System.out.println("Descending: ");//ghabla ase

        for(int i =3;i>=0;i--){
            System.out.print(" "+name[i]);
        }
           
    }
}