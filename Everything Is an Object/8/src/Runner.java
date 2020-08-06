public class Runner {
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st.i + ":st " + "\n" + st2.i + ":st2");
        st.i = 500;
        System.out.println(st.i + ":st " + "\n" + st2.i + ":st2");
    }
}
