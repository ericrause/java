/**------------------
* its a FIRST task
*/------------------
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class second { 
	public static void main(String[] args) {
        
        try {
            System.out.println("first is " +args[0]);
            System.out.println("second is " +args[1]);
            int a1 = Integer.parseInt(args[0]);
            int a2 = Integer.parseInt(args[1]);
            int summ = a1 + a2;
            System.out.println("sum is " +summ);
            
        }
        catch (Throwable t) {   //replace to exception
            System.out.println("Please enter correct numbers");
        }
        
    }
}
