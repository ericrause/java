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
        
        //parser
        String spaces = "[ ]+";
        String[] items = str.split(spaces);
        int len = items.length;             //length of 'array'
        
        //check for only integers
        for (int i=0; i < len; i++)
            try {
                int check = 0;
                check+=Integer.parseInt(items[i]);
            }
        catch (Throwable t){
            System.out.println("Please input only numubers");
            System.exit(0);
        }
        
        System.out.println("What do you want to do? ");
        String action = null; 
        action = get_string(action);
        
        System.out.println(action);
        
        
        
        //for (int i=0; i < items.length; i++)    //printing input numbers
        //    System.out.println(items[i]);
        
        int x = 0;
        switch (action) {
            case "sum": case "add to": case "сумма": case "+": case "сложить": case "прибавить":   //sum input numbers
    
                for (int i=0; i < len; i++)   
                x+= Integer.parseInt(items[i]); break;
                
            case "substract": case "deduct": case "вычитание": case "-": case "вычесть": case "разность":   //substract input numbers
    
                for (int i=0; i < len; i++)   
                x-= Integer.parseInt(items[i]); break;
                
            default:
            System.out.println("I don't know this method");
        
        }
        System.out.println(x);
    }
}