//Exercise 4:   (2) Show that protected methods have package access but are not public.



import entities.humans.Person;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        //person.personInfo(); I can`t use this method in Runner, but I can use it in Runner2. Because the one is in the same package
    }
}
