//abstract class is not class it is standards to create other class
//if it contain abstract method the it is automatically abstract class
//if it has abstract class then it must have abstract method
//abstract class don't have object 
//extend as many as subclass
abstract class ram{
    
    abstract void rollno();
}
class hari extends ram{
    void rollno(){
          System.out.println("rollno is 40");
    }
    void phoneno(){
       System.out.println("phone no is 9848301227"); 
    }

}
class sita extends ram{
    void rollno(){
          System.out.println("rollno is 50");
    }

}
public class abstractclass {
    public static void main(String[]args)
    {
      hari H=new hari();
      H.rollno();
      H.phoneno();
       sita S=new sita();
      S.rollno();
    }
}
