
//Exercise 3 : (1) Create and test a SixTuple generic


public class Runner {


    static SixTuple<String, Double, Byte, Integer, Float, Boolean> test() {
        return new SixTuple<>("Hello World", 3.14, (byte) 1, 1234, (float) 123.34, true);
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
