public class Cat {
    void say(String s) throws Exception {
        if (s.equalsIgnoreCase(Words.rrr.name())) {
            throw new Ex1();
        }
        if (s.equalsIgnoreCase(Words.wuf.name())) {
            throw new Ex2();
        }
        if (s.equalsIgnoreCase(Words.hello.name())) {
            throw new Ex3();
        } else {
            System.out.println(s);
        }

    }
}
