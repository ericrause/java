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
        String str1_out = null; 
        String str2 = null; 
        String str2_out = null; 
        String symbol = null; 
        
        
		System.out.println("Please enter first string:");
        str1 = get_string(str1);                                  //need to add check for everything
                                                                //need to add check for everything
		System.out.println("Please enter second string");         //need to add check for everything
        str2 = get_string(str2);
        
        String[][] replacements = {     //vocabulary
            {"c", "с"},                 //eng to rus
            {"C", "С"},
            {"e", "е"},
            {"E", "Е"},
            {"o", "о"},
            {"O", "О"},
            {"p", "Р"},
            {"P", "Р"},
            {"a", "а"},
            {"A", "А"},
            {"x", "х"},
            {"X", "Х"},
            {"T", "Т"},
            {"y", "у"},
            {"H", "Н"},
            {"B", "В"};
          //{"b", "ь"}
            
        }
        
        for (String[] r: replacements){
            str1_out = str1(r[0], r[1]);
        }
        System.out.println(str1_out);

        //parser
        String[] str1_items = str1.split("");
        String[] str2_items = str2.split("");
        
        for (int i=0; i < str1_items.length; i++){
		  System.out.println(str1_items[i]);
            
        }
        
            
        }
        
        
        
    }
