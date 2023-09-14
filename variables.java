import java.io.*;
public class variables {
    public static int number ; //instance variable //using static its class variable too
    public void calculate(int n){
        number=n;     
        int b=6; //local variable
        int sum=b+number;
        System.out.println("sum of number is:"+sum);
    }
    public static void main(String[]args){
        variables A= new variables();
        A.calculate(4);

    }

    
}
