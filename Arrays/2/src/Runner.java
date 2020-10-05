//Exercise 2: (1) Write a method that takes an int argument and returns an array of that
//size, filled with BerylliumSphere objects.


import java.util.Arrays;

public class Runner {
    static BerylliumSphere[] createArray(int size) {
        BerylliumSphere[] arr = new BerylliumSphere[size];
        for(int i = 0; i < size; i++){
            arr[i] = new BerylliumSphere();
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5)));

    }
}
