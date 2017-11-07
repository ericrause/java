import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class replace { 
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
        
        
        String str1 = null; 
        String str2 = null; 
        String symbol = null; 
        
        
		System.out.println("Please enter first string:");
        str1 = get_string(str1);                                  //need to add check for everything
                                                                //need to add check for everything
		System.out.println("Please enter second string");         //need to add check for everything
        str2 = get_string(str2);

        //parser
        String by_symbols = "[]+";
        String[] str1_items = str1.split(by_symbols);
        String[] str2_items = str2.split(by_symbols);
        
        for (int i : str1_items){
		  System.out.println(str1_items);
            
        }
        
            
        }
        
        
        
    }
