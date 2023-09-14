class rajesh{
    void relationship(){
        System.out.println("he is a boy:");
    }
}
class mom extends rajesh{
    void relationship(){                 //method is override and same relationship is different with another class
        System.out.println("he is a son:");
    }
}
class dad extends rajesh{
    void relationship(){
        System.out.println("he is a 1st son:");
    }
}
public class polymorphism {
    public static void main(String[]args){
        rajesh R=new mom();     //now object of rajesh can access all method of mom class
        rajesh R1=new dad();
        R.relationship();
           R1.relationship();
    }
    
}
