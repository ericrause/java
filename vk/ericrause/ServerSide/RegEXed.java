package vk.ericrause.ServerSide;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEXed {
    public static void main(String[] args){
    }

    public static double toRegEx(String expression){

//        String expression = "11+2-3*2/4+5+6+7-8-9";
//        String expression = "-2+5";
        //
        //delete spaces here
        //
        System.out.println("str: " + expression);
//        Pattern sum = Pattern.compile("\\d+[-*+/]\\d+|[-*+/]\\d+");
        Pattern sum = Pattern.compile("\\d+|[-*+/]\\d+");

        Matcher sumMatch = sum.matcher(expression);
        double regExResult = 0;
        while (sumMatch.find()) {
            System.out.println(sumMatch.start() + ") " + sumMatch.group());
            regExResult = regExResult + Double.parseDouble(sumMatch.group());
        }
        System.out.println(regExResult);
        return regExResult;

//        System.out.println("regexed: "+sumMatch.group());

    }

}
