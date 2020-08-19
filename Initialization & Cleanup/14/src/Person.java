public class Person {
    static String name = "Valentin";
    static String surname;
    static {
        surname = "Gromyko";
        System.out.println("surname initialized");
    }

    static void info(){
        System.out.println("My name: " + name +
                "\nMy surname: " + surname);
    }
    Person (){
        System.out.println("constructor used");
    }

}
