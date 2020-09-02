//Exercise 7:   (3) Create a class, then make an initialized array of objects of your class.
//Fill a List from your array. Create a subset of your List by using subList( ), then remove this subset from your List.


import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Test[] tests = new Test[30];
        for (int i = 0; i < tests.length ; i++) {
            tests[i] = new Test();
        }

        List<Test> list = new ArrayList<Test>();
        for (Test x : tests ) {
            list.add(x);
        }
        System.out.println("List Test= " + list);
        List<Test> sub = list.subList(2,8);
        System.out.println("Sublist= " + sub);
        list.removeAll(sub);
        System.out.println("List Test after delete sub items= " + list);

    }
}
