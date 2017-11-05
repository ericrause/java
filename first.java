//------------------
// its a SECOND task
//------------------
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class first_copy { 
    public static String get_string(String str){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //creates new input reader "br"
                         

            try {
                str = br.readLine();        //writes string to numbers variable
            }
            catch (IOException e) {
                e.printStackTrace();            //took from internet, don't know what it prints
            }
            System.out.println("you've entered: " +str);
            return str;
    }
	public static void main(String[] args) {
        
        
        
		System.out.println("please input numubers: ");
        String str = null; 
        str = get_string(str);
        
		System.out.println(str);
        
        //parser
        String spaces = "[ ]+";
        String[] items = str.split(spaces);
        for (int i=0; i < items.length; i++)    //printing input numbers
            System.out.println(items[i]);
        

        }
	}