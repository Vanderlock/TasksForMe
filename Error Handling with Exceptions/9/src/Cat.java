public class Cat {
    void say(String s) throws Ex1, Ex2, Ex3{
        if (s == "rrr"){
            throw new Ex1();
        }
        if (s == "Wuf"){
            throw new Ex2();
        }
        if (s == "hello"){
            throw new Ex3();
        }else {
            System.out.println(s);
        }

    }
}
