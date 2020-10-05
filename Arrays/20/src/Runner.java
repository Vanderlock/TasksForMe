//Exercise 20: (4) Demonstrate deepEquals( ) for multidimensional arrays.


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {


        int[][][] ints = new int[4][3][2];
        int[][][] ints2 = new int[4][3][2];
        System.out.println(Arrays.deepToString(ints));
        System.out.println(Arrays.deepEquals(ints, ints2));
        Cat[][][] cats3 = new Cat[4][3][2];
        Cat[][][] cats4 = new Cat[4][3][2];
        System.out.println(Arrays.deepToString(cats3));
        System.out.println(Arrays.deepEquals(cats3, cats4));
        System.out.println(Arrays.deepEquals(ints, cats3));
    }
}
