class A //overriding means having same method name in subclass that already define in super class
{ 
    void same(){
        System.out.println("i belong to class A");
    }
}
class B extends A{
     void same(){
        System.out.println("i belong to class B"); //if u remove this method then b.same() will call output from a cause of superclass
    }
}

public class overriding {
    public static void main(String[]args){
 A a=new A();
 a.same();
 B b= new B();
 b.same();
    }
}
