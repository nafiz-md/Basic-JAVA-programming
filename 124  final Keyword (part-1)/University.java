public class University {
    
    final String varsity = "JXUST";
    static final int fees;//static blank final var

    static{
        fees = 16000;
    } 

    void initComponent(){
        System.out.println(varsity);
        System.out.println(fees);
    }
}