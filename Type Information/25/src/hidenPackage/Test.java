package hidenPackage;

public class Test implements HidenInterface{
    private void printPrivate(){
        System.out.println("private");
    }
    protected void printProtected(){
        System.out.println("protected");
    }
    public void print(){
        System.out.println("public");
    }
}
