//abstract class only can extend only 1 interface
interface Printable {    //interface
    void print();
}

abstract class Shape { //abstract class
    abstract double calculateArea();
}

class PrintableCircle extends Shape implements Printable {
    double radius;

    PrintableCircle(double radius) {  //constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Printing Circle...");
    }
}


public class abstractandinterface {
    public static void main(String[] args) {
        PrintableCircle circle = new PrintableCircle(5.0);
        System.out.println("Area: " + circle.calculateArea()); // Output: Area: 78.53981633974483
        circle.print(); // Output: Printing Circle...
    }
}



    

