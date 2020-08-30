//Exercise 26:   (2) Create a class with an inner class that has a non-default constructor (one that takes arguments).
// Create a second class with an inner class that inherits from the first inner class.



public class Runner {
    public static void main(String[] args) {
        AOut aOut = new AOut();
        BOut bOut = new BOut();
        BOut.BInn bInn = bOut.new BInn(aOut);
    }
}
