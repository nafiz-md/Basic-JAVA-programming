public class StringDemo2 {
    public static void main(String[] args){
        String firstName = "Anisul";
        String lastName = " Islam";

        String fullName = firstName.concat(lastName);
        //String fullName = firstName+lastName;
            System.out.println("Full name:  "+fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println("Upper Name: "+upperName);

        String lowerName = fullName.toLowerCase();
        System.out.println("Lower Name: "+lowerName);

        boolean check = firstName.startsWith("A");/////////////////
        System.out.println("The result is "+check);

        boolean check2 = firstName.endsWith("sul");
        System.out.println("The result is "+check2);

        String[] name = {"Anis","Sobuj","Niloy"};
        for(String x: name)
        System.out.println(" "+x);

        System.out.println(" ");

        for(int i=0;i<3;i++)
        System.out.println(" "+name[i]);

    }
}