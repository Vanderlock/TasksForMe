//Exercise 8: (5) Write a method that takes an object and recursively prints all the classes
//in that object’s hierarchy.

//Exercise 9: (5) Modify the previous exercise so that it uses
//Class.getDeclaredFields( ) to also display information about the fields in a class.


public class Runner {
    public static void getHierarchy(Object o) {
        Object[] fields = o.getClass().getDeclaredFields();
        if(fields.length == 0)
            System.out.println(o.getClass() + " has no fields");
        if(fields.length > 0) {
            System.out.println("Field(s) of " + o.getClass() + ":");
            for(Object obj : fields)
                System.out.println(" " + obj);
        }
        if(o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is a subclass of " +
                    o.getClass().getSuperclass());
            try {
                getHierarchy(o.getClass().getSuperclass().newInstance());
            } catch(InstantiationException e) {
                System.out.println("Unable to instantiate obj");
            } catch(IllegalAccessException e) {
                System.out.println("Unable to access");
            }
        }
    }
    public static void main(String[] args) {
        getHierarchy(new Rat());
        Runner runner = new Runner();
        System.out.println(runner.getClass().getSuperclass());
    }



}
