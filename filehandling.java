import java.io.*;
import java.util.*;
public class filehandling {
    public static void main(String[]args){
        
        /**try{
            File myfile=new File("ram.txt");
            myfile.createNewFile();     //create file
        }
        catch(Exception e)
        {
            System.out.println("exception is"+e.getMessage());
        }**/
       
        try{
             FileWriter filewritter=new FileWriter("ram.txt");
            filewritter.write("i am rajesh shahi");
            filewritter.close();
        }
        catch(Exception e){
            System.out.println("exception is"+e.getMessage());
        }
    
    try{
        File myfile=new File("ram.txt");
        Scanner scanner=new Scanner(myfile);
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            System.out.println(line);
        

        }
        scanner.close();
    }
    catch(Exception e) {
         System.out.println("exception is"+e.getMessage());
    }
}
}
