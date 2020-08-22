public class Test {
    int a = 1;
    public int b = 2;
    private int c = 3;
    protected int d = 4;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

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
