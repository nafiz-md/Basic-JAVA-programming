public class Test {
    public static void main(String[] args) {
        
        MobileUser mob;//reference var
        
        mob = new RahimUddin();
        mob.call();
        mob.sendMessage();
        
        mob = new Karim();
        mob.sendMessage();
    }
}