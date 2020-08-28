//Exercise 14:   (2) Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
// Create a class by implementing the new interface and also inheriting from a concrete class.
// Now write four methods, each of which


//Exercise 15:   (2) Modify the previous exercise by creating an abstract class and inheriting that into the derived class.


import interfaces.*;

public class Runner {
    public static void m1(History history) {
        history.v();
    }
    public static void m2(Exam exam) {
        exam.w();
    }
    public static void m3(Labs labs) {
        labs.y();
    }
    public static void m4(Workup workup) {
        workup.zz();
    }

    public static void main(String[] args) {
        Anesthesiologist anesthesiologist = new Anesthesiologist();
        m1(anesthesiologist);
        m2(anesthesiologist);
        m3(anesthesiologist);
        m4(anesthesiologist);

    }
}
