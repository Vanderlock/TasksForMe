//Exercise 21:   (2) Create an interface that contains a nested class that has a static method
// that calls the methods of your interface and displays the results.
// Implement your interface and pass an instance of your implementation to the method.


import Interfaces.Interface;

public class Runner {
    public static void main(String[] args) {
        Test test = new Test();
        Interface.Nested.testInterface(test);
    }
}
