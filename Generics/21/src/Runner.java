//Exercise 21: (4) Modify ClassTypeCapture.java by adding a
//Map<String,Class<?>>, a method addType(String typename, Class<?> kind), and
//a method createNew(String typename). createNew( ) will either produce a new
//instance of the class associated with its argument string, or produce an error message.


public class Runner {
    public static void main(String[] args) {


        ClassTypeCapture classTypeCapture = new ClassTypeCapture();
        classTypeCapture.addType("Building", Building.class);
        classTypeCapture.addType("House", House.class);
        classTypeCapture.addType("String", String.class);
        System.out.println(classTypeCapture.createNew("Building").getClass());
        System.out.println(classTypeCapture.createNew("House").getClass());
        System.out.println(classTypeCapture.createNew("String").getClass());
        //exception
        classTypeCapture.createNew("Apple");
    }
}
