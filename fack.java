import java.io.IOException;

public class fack { 
    public static void main(String[] args) {
        try {
            fack(Integer.parseInt(args[0]));
        }
        catch (Throwable t) {
            System.out.println("Please enter a valid number");
        }
    }
    
    
    public static Integer fack(Integer f) {
        if (f!=1) {
            f*=fack(f-1);
        }
    
        System.out.println(f);
        return f;
    }
}