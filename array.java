import java.util.Scanner;
public class array{
    public static void main(String[]args)
    {
        Scanner A=new Scanner(System.in);
        int[] array= new int[10];
         System.out.println("enter 10 values:");
        for(int i=0;i<10;i++){
           System.out.print("enter "+(i+1)+ " value");
           array[i]=A.nextInt();
           System.out.println(" value of  "+(i+1)+ " is "+array[i]);
        }
        System.out.println(" enter postion to delete number");
        int position = A.nextInt();
        if(position< 1 || position >10){
             System.out.println(" wrong");
        }
        else{
            for(int i=position-1;i<9;i++){
              array[i]=array[i+1];
            }
            array[9]=0;
        }
        System.out.println("Array after deleting element at position " + position + ":");
        for (int num : array) {
            System.out.print(num + " ");
        }
         
    }

}
