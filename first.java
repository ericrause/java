//------------------
// its a SECOND task
//------------------
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class first { 
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
	public static void main(String[] args) {
        
        
        
		System.out.println("please input numubers: ");
        String str = null; 
        str = get_string(str);
        
        System.out.println("What do you want to do? ");
        String action = null; 
        action = get_string(action);
        
        System.out.println(action);
        
        
        //parser
        String spaces = "[ ]+";
        String[] items = str.split(spaces);
        //for (int i=0; i < items.length; i++)    //printing input numbers
        //    System.out.println(items[i]);
        
        int x = 0;
        switch (action) {
            case "sum":                         //sum input numbers
                for (int i=0; i < items.length; i++)   
                x+= Integer.parseInt(items[i]); break;
            
        
        }
        System.out.println(x);
    }
}