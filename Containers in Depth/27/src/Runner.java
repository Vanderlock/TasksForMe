//Exercise 27: (3) Modify the hashCode( ) in CountedString.java by removing the
//combination with id, and demonstrate that CountedString still works as a key. What is the
//problem with this approach?


import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        Map<CountedString, Integer> map = new HashMap<>();
        CountedString[] countedStrings = new CountedString[7];
        for (int i = 0; i<countedStrings.length; i++){
            countedStrings[i] = new CountedString("hi");
            map.put(countedStrings[i],i);
        }
        for (CountedString countedString : countedStrings){
            System.out.println("Looking up " + countedString);
            System.out.println(map.get(countedString));
        }
    }
}
