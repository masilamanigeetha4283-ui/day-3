interface RBI{
    void amount();
}
class SBI implements RBI{
    public void amount(){
        System.out.println("Amount is NIL");
    }
}
public class Interface {
    public static void main(String[] args) {
        SBI sb = new SBI();
        sb.amount();
    }
    
}
