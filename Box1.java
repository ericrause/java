/** public interface ToCount {
    int getLength();
    
}
public class Item implements ToCount {
    @Override 
    public int getLength(){
        return 0;
    }
    
}
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Rectangle {
    double width;
    double height;
    
    double space() {
        return width * height;
    }
    
     public static String get_string(String str){

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
    }
    
    void getDims(double a1, double a2){
            System.out.println("Please enter figure dimensions (a=? b=?)");
            String str = null; 
            str = get_string(str);
            String spaces = "[ ]+";
            String[] items = str.split(spaces);
            double[] scalars;
            int len = items.length; 

            for (int i=0; i < len; i++)
            try {
                scalars[i]=Double.parseDouble(items[i]);
            }
            catch (Throwable t){
                System.out.println("Please input only numubers");
                System.exit(0);
            }
        
    }
    void setDims(double w, double h){
        width=w;
        height=h;
    
    }
}

class Box1 {
    public static void main(String args[]){
        Rectangle mybox = new Rectangle();
        double boxSpace;
        
        mybox.setDims(5,5);
            
        boxSpace=mybox.space();
        System.out.println("Space is " +boxSpace);
        
    }
}