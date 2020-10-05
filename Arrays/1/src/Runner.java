//Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an
//argument. Call the method, creating the argument dynamically. Demonstrate that ordinary
//aggregate array initialization doesn’t work in this case. Discover the only situations where
//ordinary aggregate array initialization works, and where dynamic aggregate initialization is
//redundant.


public class Runner {
    static void breakUp(BerylliumSphere[] s) {
        System.out.println("Break up " + s.length + " sphere(s)");

    }

    public static void main(String[] args) {
        //Dynamic initialization:
        breakUp(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()});
        //can`t create
        //breakUp({new BerylliumSphere()});
        //aggregate array initialization is worked
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        breakUp(d);
        // Dynamic aggregate initialization is redundant
        BerylliumSphere[] a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};
        breakUp(a);
    }
}
