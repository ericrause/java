import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class first { 
	public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("please input 2(two) numubers: ");
        String numbers = null;
        try {
            numbers = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("you've entered: " +numbers);
	}
}