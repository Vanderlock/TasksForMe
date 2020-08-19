//Exercise 12:   (4) Create a class called Tank that can be filled and emptied,
// and has a termination condition that it must be empty when the object is cleaned up.
// Write a finalize( ) that verifies this termination condition.
// In main( ), test the possible scenarios that can occur when your Tank is used.


public class Runner {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank(80);
        Tank t3 = new Tank(1000);
        Tank t4 = new Tank(0);
        t3.pourOut();
        new Tank(10); //Untitled Tank class object
        System.out.println("Status t1= ");
        t1.printStatus();
        System.out.println("Status t2= ");
        t2.printStatus();
        System.out.println("Status t3= ");
        t3.printStatus();
        System.out.println("Status t4= ");
        t4.printStatus();
        System.gc();
        t1.pourOut();
        t2.pourOut();
        t3.pourOut();
        t4.pourOut();
        System.out.println("Status t1= ");
        t1.printStatus();
        System.out.println("Status t2= ");
        t2.printStatus();
        System.out.println("Status t3= ");
        t3.printStatus();
        System.out.println("Status t4= ");
        System.gc();
        System.runFinalizersOnExit(true); //to clean new Tank(10); (Untitled Tank class object)
        System.gc();


    }
}
