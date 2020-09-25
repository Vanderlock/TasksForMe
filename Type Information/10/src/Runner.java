//Exercise 10: (3) Write a program to determine whether an array of char is a primitive
//type or a true Object.


public class Runner {
    public static void main(String[] args) {
        char[] charArr = new char[3];

        System.out.println("Superclass of char[] charArr: " +
                charArr.getClass().getSuperclass());
        System.out.println("char[] charArr instanceof Object: " +
                (charArr instanceof Object));
    }
}
