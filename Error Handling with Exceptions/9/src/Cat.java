public class Cat {
    void say(String s) throws Ex1, Ex2, Ex3{
        if (s.equalsIgnoreCase("rrr")){
            throw new Ex1();
        }
        if (s.equalsIgnoreCase("Wuf") ){
            throw new Ex2();
        }
        if (s.equalsIgnoreCase("hello")){
            throw new Ex3();
        }else {
            System.out.println(s);
        }

    }
}
