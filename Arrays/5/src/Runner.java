//Exercise 5: (1) Demonstrate that multidimensional arrays of nonprimitive types are
//automatically initialized to null.


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Cat[][][] cats3d = new Cat[3][3][3];
        System.out.println(Arrays.deepToString(cats3d));
    }
}
