//Exercise 11: (2) Show that autoboxing doesn’t work with arrays.


public class Runner {
    public static void main(String[] args) {

        int a = 56;
        Integer i = a;
        Integer b = 15;
        int c = b;
        System.out.printf("int a = %d, Integer i = %d, Integer b = %d, int c = %d", a, i, b, c);
        //I cannot do the same, the compiler swears

//        int[] arrA = { 1, 2, 3, 4, 5 };
//        Integer[] arrI = arrA;
//        Integer[] arrB = { 1, 2, 3, 4, 5 };
//        int[] arrC = arrB;
    }
}
