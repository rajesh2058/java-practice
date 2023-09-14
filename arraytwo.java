import java.util.Scanner; //import scanner class from java package
public class arraytwo {   //insert 10 array and seperate on base of even and odd
   public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
          int[] array=new int[10];   //defining int having array and next size of array. array is object name
          int[] evenarray=new int[10];
             int[] oddarray=new int[10];
          System.out.println("enter 10 values for array:");
          for(int i=0;i<10;i++){ 
            System.out.println("enter"+(i+1)+" values for array:");
            array[i]=scanner.nextInt();
             System.out.println("value at position is:"+array[i]);
          }
          int evencount=0;
          int oddcount=0;
        for(int num:array){    //value store in array will equal to num for comparision
            if(num %2==0){
                evenarray[evencount]=num; //new array for even number
                evencount++;
              
        
            }
            else{
                oddarray[oddcount]=num;
                oddcount++;
                
            }
        }
   for(int num:evenarray){
  System.out.println(+ num+"");
   }
   for(int num:oddarray){
  System.out.println(+ num+"");
   }
        
         
    }
    
}
