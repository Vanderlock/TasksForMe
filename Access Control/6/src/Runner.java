//Exercise 6:   (1) Create a class with protected data.
// Create a second class in the same file with a method that manipulates the protected data in the first class.


public class Runner {
    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
        System.out.println(protectedClass.name + " " + protectedClass.age);
        ChangeProtectedClass.change(protectedClass,"Nick",60);
        System.out.println(protectedClass.name + " " + protectedClass.age);
    }
}
