class A   //having same method in same class but different parameters
{
    int add(int a,int b){
        return a+b;
    }
        
float add(float a,float b){
        return a+b;
    }
}
public class overloading {
    public static void main(String[]args){
    A a= new A();
    
    System.out.println(a.add(2,3));
    System.out.println(a.add(2.3f,2.5f));

}
}