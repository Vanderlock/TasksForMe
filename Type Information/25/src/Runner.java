//Exercise 25: (2) Create a class containing private, protected and package-access
//methods. Write code to access these methods from outside of the class’s package.


import hidenPackage.HidenInterface;
import hidenPackage.TestForShow;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        HidenInterface hide = TestForShow.show();
        for(Method m : hide.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            m.invoke(hide);
        }
    }
}
