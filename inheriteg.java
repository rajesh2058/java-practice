class human{
    String name;
    int age;
}
class employee extends human{
    double salary;
    void showdata(double salary){
        this.salary=salary;
        System.out.println("salary is:"+salary);
    }
}
class manager extends employee{
    void showdata(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        System.out.println("salary is:"+salary);
        System.out.println("salary is:"+age);
        System.out.println("salary is:"+name);
    }
}
public class inheriteg {
    public static void main(String[]args){
    manager M=new manager();
    M.showdata("rajesh",22,20000);

    }
    
}
