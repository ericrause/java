import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class reverse {
        public static String get_string(String str){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //creates new input reader "br"
                         

            try {
                str = br.readLine();        //writes string to numbers variable
            }
            catch (IOException e) {
                e.printStackTrace();            //took from internet, don't know what it prints
            }
            return str;
        }
    public static void main(String[] args){
        
            System.out.println("Please enter a string");
            String str = null; 
            str = get_string(str);
        
        
            //parse
            String[] items = str.split("");
            int len = items.length; 
            System.out.println("Length is " +len);
            String rev = "";
            for (int i=len-1; i>=0;i--){
                rev+=items[i];
                
            }
                System.out.println(rev);
    }
    
}