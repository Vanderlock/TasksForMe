

//Exercise 18:   (2) Create a class with a static final field and a final field
// and demonstrate the difference between the two.


import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {


        Test a = new Test();
        Test b = new Test();
        System.out.println("final a.i1: "+ a.i1);
        System.out.println("final b.i1: "+ b.i1);
        System.out.println("static final a.i2: "+ a.i2);
        System.out.println("static final b.i2: "+ Test.i2);//Test.ia better then a.i2

        //output:
//        final a.i1: 15
//        final b.i1: 13
//        static final a.i2: 18
//        static final b.i2: 18
        //in static final fields i can reference a static variable without having ever created an instances of the type,
        //therefore this variable is common for each created object
        //in final fields the variable refers only to the created instance of the class


    }
}
