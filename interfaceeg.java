//can implement several interface in single class
//no variables
//single interface can extend multiple interface
//achieve multiply inheritance
interface hari { 
    void job();
}
    interface raju{
    void role();
}
     class ram implements hari,raju{
    public void job()
    {
        System.out.println("cook");
    }
    public void role(){
        System.out.println("head");
    }

}
public class interfaceeg{
    public static void main(String[]args){
       ram I=new ram();
       I.job();
       I.role();

    }
}
