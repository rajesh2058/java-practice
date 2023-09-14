/**class A{
    void sum(){
        System.out.println("sum of no");
    }
}
class B{
    void sum(){
        System.out.println("sum of no b");
    }
}
class C extends A,B{     //here compiler become confused to class whom after both super class has same 
    //methods so multiple inheritance is impossible
    void sum();
}
public class multiinheritance {
    public static void main(String[]args){
        C c=new C();
        c.sum();
    }
} **/
