public class DataOnly {
    private int i;
    private float f;
    private boolean b;
    // I use only constructor, but i can use setter if you want
    public DataOnly() {
    }

    public DataOnly(int i, float f, boolean b) {
        this.i = i;
        this.f = f;
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }


}
