import java.io.IOException;

public class fack { 
    public static void main(String[] args) {
        
        //if length!=0 print error     
    
        try {
            fack(Integer.parseInt(args[0]));
        }
        catch (Throwable t) {               //replace to exception or number format exception
            System.out.println("Please enter a valid number");
        }
    }
    
    
    public static Integer fack(Integer f) {     //integer to int
        if (f!=1) {
            f*=fack(f-1);
        }
    
        System.out.println(f);
        return f;
    }
}