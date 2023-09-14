import java.util.Scanner;
public class SubtactValueOfArray {
    public static void main(String[]args)
    {
      Scanner A=new Scanner(System.in);
      int[] P= new int[4];
  
      for(int i=0;i<4;i++){
      System.out.println("enter "+(i+1)+" no:");
      P[i]= A.nextInt();
     
      }   
      for(int i=3;i>0;i--){
  int sub=P[i]-P[i-1];
   System.out.println("sub is:" +sub);
      }
      
for(int num:P){
    System.out.println(num+" ");
}
    }
}