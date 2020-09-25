import typeinfo.factory.Null;

public class NullPart extends Part implements Null {
    private NullPart() { super(); }
    public static final Part NULL = new NullPart();
    public static class Factory implements typeinfo.factory.Factory<NullPart> {
        public NullPart create() { return (NullPart)NULL; }
    }
    public String toString() { return "NULL"; }
}
