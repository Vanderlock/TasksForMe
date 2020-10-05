//Exercise 22: (2) Show that the results of performing a binarySearch( ) on an unsorted
//array are unpredictable.



import java.util.Arrays;


public class Runner {

     public static void main(String[] args) {
        int[] arr = {1,4,3,0,9,3,2,7,8,6};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++) {
            int index = Arrays.binarySearch(arr, i);
            if(index >= 0){
                System.out.println("int: " + i + " at position: " + index);
            }
            else{
                System.out.println("int: " + i + " not found in array");
            }

        }
        
        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++) {
            int index = Arrays.binarySearch(arr, i);
            if(index >= 0){
                System.out.println("int: " + i + " at position: " + index);
            }
            else{
                System.out.println("int: " + i + " not found in array");
            }
        }
    }

}
