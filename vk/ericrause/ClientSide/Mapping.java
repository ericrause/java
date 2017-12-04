package vk.ericrause.ClientSide;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapping {

    public static HashMap<String, Double> mapCounted;
    static HashMap<String, Integer> mapForClone = new HashMap<>();
    private static HashMap<Integer, HashMap<String, Integer>> mapOfMaps = new HashMap<>();

    public static Integer countOfPairs;
    public static Integer countOfMaps;


    public static void main(String[] args) {
        addToHashMap("s1", 123.0);
        printMap();
        addToHashMap("s2", 1234.0);
        printMap();
        addToHashMap("s3", 12345.0);
        printMap();
        System.out.println(mapOfMaps.get(1));

        //after clonning put mapForClone inside first cell of mapOfMaps
        //and clear mapCounted
    }

    public static String searchInMap(String str){

            if (mapCounted.get(str)!=null) {                //here we should check if str->value exists
                                                            //probably here can be NPE

                return mapCounted.get(str).toString();
            }
            else {
                //add iterator for mapOfMaps
                //foreach key in mapOfMaps try to return map.get(str).toString(); else return throwable;
                for (Map.Entry<Integer, HashMap<String, Integer>> entry : mapOfMaps.entrySet())
                {
                    if (entry.getValue().get(str)!=null) {
                        return entry.getValue().get(str).toString();        //return map.get(str).toString();
                    }
                    else {

                    }
                }
                return "nope"; //return NOT throwable

            }
    }

    private static void cloneMap(){
        mapForClone = (HashMap)mapCounted.clone();          //or mapForClone.putAll(mapCounted)
        mapOfMaps.put(countOfMaps,mapForClone);
        mapCounted.clear();
        countOfMaps++;
        countOfPairs=0;
        System.out.println("Successfully clonned and cleared");
    }

    private static void initHashMap(){      //creates empty hash map
        mapCounted = new LinkedHashMap<String, Double>(16,0.75f,true);
    }

    public static void addToHashMap(String expression, Double result) {
//        if (countOfPairs < 10) {
            if (mapCounted == null) {       //verify if map empty
                initHashMap();
            }
            mapCounted.putIfAbsent(expression, result);     //check for existing expression
//            countOfPairs++;
//        }
//        else {              //cloning map to mapOfMaps
//            cloneMap();
//            addToHashMap(expression, result);
//        }
    }

    private static void printMap() {             //prints map
        if (mapCounted.size() != 0) {
            for (Map.Entry<String, Double> entry : mapCounted.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
        else {
            System.out.println("Map is empty");
        }
    }

}
