//Exercise 21: (3) Try to sort an array of the objects in Exercise 18. Implement
//Comparable to fix the problem. Now create a Comparator to sort the objects into reverse
//order.

//Exercise 18: (3) Create and fill an array of BerylliumSphere. Copy this array to a new
//array and show that it’s a shallow copy.


import java.util.Arrays;


public class Runner {
    public static void main(String[] args) {


        BerylliumSphere[] spheres1 = new BerylliumSphere[5];
        for(int i = 0; i < spheres1.length; i++)
        {
            spheres1[i] = new BerylliumSphere();
        }
        System.out.println("spheres1: " + Arrays.toString(spheres1));
        BerylliumSphere[] spheres2 = new BerylliumSphere[5];
        System.out.println("null spheres2: " + Arrays.toString(spheres2));
        System.arraycopy(spheres1, 0, spheres2, 0, spheres1.length);


        System.out.println("spheres1: " + Arrays.toString(spheres1));
        System.out.println("copy spheres2: " + Arrays.toString(spheres2));


        BerylliumSphere[] compSpheres = new BerylliumSphere[5];
        for(int i = 0; i < compSpheres.length; i++)
        {
            compSpheres[i] = new BerylliumSphere();
        }

        System.out.println("compSpheres: " + Arrays.toString(compSpheres));


        Arrays.sort(compSpheres, new CompBerylliumSphereComparator());
        System.out.println("compSpheres: " + Arrays.toString(compSpheres));
    }
}
