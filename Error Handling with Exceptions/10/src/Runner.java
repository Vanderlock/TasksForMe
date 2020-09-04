//Exercise 10: (2) Create a class with two methods, f( ) and g( ). In g( ), throw an
//exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch
//clause, throw a different exception (of a second type that you define). Test your code in
//main( ).


public class Runner {
    public static void main(String[] args) throws Ex2 {
        Cat cat = new Cat();
        cat.f();
    }
}


//output
//Exception in thread "main" Ex2: Exception2 method f()
//	at Cat.f(Cat.java:8)
//	at Runner.main(Runner.java:10)
//Caused by: Ex1: Exception1 method g()
//	at Cat.g(Cat.java:12)
//	at Cat.f(Cat.java:6)