//------------------
// its a SECOND task
//------------------
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class first { 
	public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //creates new input reader "br"
        
		System.out.println("please input numubers: ");
        String numbers = null;              
        
        try {
            numbers = br.readLine();        //writes string to numbers variable
        }
        catch (IOException e) {
            e.printStackTrace();            //took from internet, don't know what it prints
        }
        System.out.println("you've entered: " +numbers);
        
        //loop function add number
        public class summarize {
            public static void summ(int... args) {       //reads numbers and adds up them
                System.out.println("functional " +numbers);
            }
            //first.summ(numbers);
        }
	}
}