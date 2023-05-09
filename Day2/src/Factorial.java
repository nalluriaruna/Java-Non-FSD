
import java.util.Scanner;
public class Factorial {  
 
    public static void main(String args[]) {
         int fact=1;
        Scanner a = new Scanner(System.in);
          System.out.print("Enter a number = ");
          int n = a.nextInt(); 
        
        for (int i=1; i<=n; i++)  
        {
            fact=fact*i;
        }
        System.out.println("factorial is " +fact );


}
    

}
