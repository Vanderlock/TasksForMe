public class Runner {
    public static void main(String[] args) {


        //Q: It will work in other class runner?
        //A: Yes if i change field "Cup" to non private




        BlankFinal b3 = new BlankFinal();
        BlankFinal b4 = new BlankFinal(300);
        // b1.cup = new Cup(2); // Errors: cannot assign values
        // b2.cup = new Cup(3); // to final variables p
        System.out.println("b1.cup: " + b3.cup);
        System.out.println("b2.cup: " + b4.cup);
    }
}
