package bookExamples;

import static bookExamples.Signal.*;

public class TrafficLight {
    private static Signal color = RED;

    public static void change() {
        switch (color) {
            case RED:
                color = GREEN;
                break;
            case YELLOW:
                color = RED;
                break;
            case GREEN:
                color = YELLOW;
                break;
        }
    }

    public static void look() {
        System.out.println(color);
    }

}
