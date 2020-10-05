//Exercise 18: (3) Create and fill an array of BerylliumSphere. Copy this array to a new
//array and show that it’s a shallow copy.


import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {


        BerylliumSphere[] spheres1 = new BerylliumSphere[4];
        Arrays.fill(spheres1, new BerylliumSphere());
        BerylliumSphere[] spheres2 = new BerylliumSphere[4];
        System.out.println("spheres1 = " + Arrays.toString(spheres1));
        System.out.println("null spheres2 = " + Arrays.toString(spheres2));
        System.arraycopy(spheres1, 0, spheres2, 0, spheres2.length);
        System.out.println("copy spheres2 = " + Arrays.toString(spheres2));


        spheres1[1] = spheres1[3] = new BerylliumSphere();
        System.out.println("changed spheres1 = " + Arrays.toString(spheres1));
        System.out.println("copy spheres2 dont change: " + Arrays.toString(spheres2));


        spheres1[0].setId(-5);
        System.out.println("spheres1 changed : " + Arrays.toString(spheres1));
        System.out.println("spheres2 changed too = " + Arrays.toString(spheres2));


    }
}
