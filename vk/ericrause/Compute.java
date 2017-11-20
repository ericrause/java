package vk.ericrause;

public class Compute {
    public static String toCompute(String str) {
        //parse term by *+-/ to doubles
        //
        String operations = "[ +-/*]+";

        String[] parsedStr = str.split(operations);



        double test1, test2, test3;
        test1 = Double.parseDouble(parsedStr[0]);
        test2 = Double.parseDouble(parsedStr[1]);
        test3 = test1 + test2;
/**
        double items[]=null;
        int len = parsedStr.length;
        //for (int i=0; i < len; i++){
            items[0] = Double.parseDouble(parsedStr[0].toString());
            items[1] = Double.parseDouble(parsedStr[1].toString());
       // }
 */
        String result = "";
        result = Double.toString(test3) ;

        return result;
    }
}
