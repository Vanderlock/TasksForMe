//Exercise 5:   (2) Create a class called Dog with an overloaded bark( ) method.
//This method should be overloaded based on various primitive data types, and print different types of barking, howling, etc.
//, depending on which overloaded version is called. Write a main( ) that calls all the different versions.
//Exercise 6:   (1) Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
//but in reversed order relative to each other. Verify that this works.



public class Runner {
    public static void main(String[] args) {
        Dog d = new Dog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        d.bark();
        d.bark(c);
        d.bark(b);
        d.bark(s);
        d.bark(1);
        d.bark(1L);
        d.bark(1.0f);
        d.bark(1.0);
        d.bark(c, 1);
        d.bark(1, c);
    }


}
