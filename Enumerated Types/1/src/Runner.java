

//Exercise 1: (2) Use a static import to modify TrafficLight.java so you don’t have to
//qualify the enum instances.


import bookExamples.*;

import static bookExamples.TrafficLight.*;
import static bookExamples.Signal.*;

public class Runner {
    public static void main(String[] args) {
        for (Signal s : values()) {
            System.out.println(s + ": " + s.getDescription());
        }
        for (int i = 0; i < 10; i++) {
            change();
            look();
        }
    }
}
