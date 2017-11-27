package vk.ericrause;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEXed {
    public static void main(String[] args){
//        String expression = "11+2-3*2/4+5+6+7-8-9";
        String expression = "55+777+7-8";
        //
        //delete spaces here
        //
        System.out.println("str: "+expression);
        Pattern sum = Pattern.compile("\\d+[-*+/]\\d+");

        Matcher sumMatch = sum.matcher(expression);
        while (sumMatch.find()) {
            System.out.println(sumMatch.start() +") "+ sumMatch.group());
        }

//        System.out.println("regexed: "+sumMatch.group());


    }

}
