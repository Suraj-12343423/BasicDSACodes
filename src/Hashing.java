import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();

        //INSERTION
        map.put("India",190);
        map.put("Pakistan",170);
        map.put("China" ,190);

        System.out.println(map);

        //SEARCH

        if(map.containsKey("Afghanistan")){
            System.out.println("Key Present");
        }else{
            System.out.println("Key Absent");
        }

        
    }
}
