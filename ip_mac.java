import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class ip_mac { 
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
        
        
        String ip_1 = null; 
        String ip_2 = null; 
        String mac = null; 
        
		System.out.println("Please input first IP");
        ip_1 = get_string(ip_1);                                  //need to add check for everything
                                                                //need to add check for everything
		System.out.println("Please input second IP");         //need to add check for everything
        ip_2 = get_string(ip_2);

		System.out.println("Please input MAC");
        mac = get_string(mac);
        
        
        
        //parser
        String dots = "[.]+";
        String[] ip_1_items = ip_1.split(dots);
        String[] ip_2_items = ip_2.split(dots);
        String[] mac_items = mac.split(dots);
        
        //translate items_n to byte

        byte[] bytearray = new byte[4];
        for (int i=1; i<ip_1_items.length;i++) {
            int temp;
            temp = Integer.parseInt(ip_1_items[i]);
            
            final BigInteger bi = BigInteger.valueOf(temp);
            final byte[] bytes = bi.toByteArray();

            System.out.println(Arrays.toString(bytes));
            
            
        }
        
        
        
    }
}