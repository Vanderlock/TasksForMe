
//Exercise 40: (3) Add a speak( ) method to all the pets in typeinfo.pets. Modify
//Apply.java to call the speak( ) method for a heterogeneous collection of Pet

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        List<Pet> petList = Arrays.asList(new Pug(), new Mouse(), new Dog(), new Manx(),
                new Hamster(), new Rat(), new EgyptianMau(),
                new Cymric(), new Mutt());
        try {
            Apply.apply(petList, Pet.class.getMethod("speak"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
