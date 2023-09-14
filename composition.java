//composition is creating class by another class object
class ram{
    void ra(){
System.out.println("hi i am rajesh:");
    }
}
class hari{
    public ram ram;
    void wow(){
        ram=new ram();
        ram.ra();
    }
}
public class composition {
    public static void main(String[]args){
        hari R=new hari();
        R.wow();
    }
}
