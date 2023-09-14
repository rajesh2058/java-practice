   class ram{
    int a=5;}  //reusability of code by making sub class of ram 
    public class hari extends ram{
        int c=4; // instance variable which is in class but outside method
        static int w=8; //static variable outside method and in class . static value remain same for all object
        void add(){
        int b=6;    //local variable which is in method
        int sum=a+b+c+w;
        System.out.println("sum is"+sum);
        }
    
    public static void main(String[]args){
     hari p= new hari();
        p.add();
        

    }
}
    

