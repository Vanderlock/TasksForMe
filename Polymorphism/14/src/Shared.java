public class Shared {
    int refCount = 0;
	public Shared() {
        System.out.println("Creating " + this);
	}
	public void addRef() {
	    refCount++;
	}
	public String toString() {
	    return "Shared " ;
	}
	public void showRefCount() {
        System.out.println("refcount = " + refCount); }
}
