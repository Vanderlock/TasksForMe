//Exercise 9: (3) Create the classes necessary for the Peel<Banana> example and show
//that the compiler doesn’t accept it. Fix the problem using an ArrayList.


import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //compiler doesn’t accept it
        //Peel<Banana>[] peels = new Peel<Banana>[10];
        List<Peel<Banana>> peels = new ArrayList<Peel<Banana>>();
        for(int i = 0; i < 10; i++){
            peels.add(new Peel<Banana>(new Banana(i)));
        }

        System.out.println(peels);

    }
}
