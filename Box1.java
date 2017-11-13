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
import java.lang.Double;
import java.text.NumberFormat;


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
            double[] scalars = new double[2];
            int len = items.length;
        
            NumberFormat formatter = NumberFormat.getInstance();

            for (int i=0; i < len+1; i++) {
                //try {
                   // scalars[i]=Double.parseDouble(items[i]);
                    scalars[i]=formatter.parse(items[i]).doubleValue(); }
                //}
                //catch (Exception e){
                //    System.out.println("Please input only numubers");
                //    System.exit(0);
                //}
            width=scalars[0];
            System.out.println("scalars 0 = " +scalars[0]);
            height=scalars[1];
            System.out.println("scalars 1 = " +scalars[1]);
    }
    //void setDims(double w, double h){}
}

class Box1 {
    public static void main(String args[]){

        double width;
        double height;
        
        double a=0;
        double b=0;
        
        Rectangle mybox = new Rectangle();
        double boxSpace;
        
        mybox.getDims(a,b);
        //mybox.setDims(scalars[0], scalars[1]);
            
        boxSpace=mybox.space();
        System.out.println("Space is " +boxSpace);
        
    }
}