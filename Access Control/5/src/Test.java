public class Test {
    int a = 1;
    public int b = 2;
    private int c = 3;
    protected int d = 4;

    public Test() {
        System.out.println("constructor");
    }

    void printA(){
        System.out.println(a);
    }
    public void printB(){
        System.out.println(b);
    }
    private void printC(){
        System.out.println(c);
    }
    protected void printD(){
        System.out.println(d);
    }

}
