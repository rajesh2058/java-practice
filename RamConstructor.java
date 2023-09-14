class Super {
    String name;
    int rollno;

    public Super(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        
        System.out.println("Name is " + name + " Roll no is " + rollno);
    }
}

class Constructor extends Super {
    public Constructor() {
        super("Alice", 30);//super is use for immidate reference of parent class
        System.out.println("Name is " + name + " Roll no is " + rollno);
    }
}

public class RamConstructor {
    public static void main(String[] args) {
        Super superObj = new Super("Ram", 20);
        Constructor subc = new Constructor();
    }
}


