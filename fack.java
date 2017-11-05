import java.io.IOException;

public class fack { 
    public static void main(String[] args) {
        fack(Integer.parseInt(args[0]));
    }
    
    
    public static Integer fack(Integer f) {
        if (f!=1) {
            f*=fack(f-1);
        }
    else {
        System.out.println(f);
        return f;
    }
    
        System.out.println(f);
        return f;
    }
}