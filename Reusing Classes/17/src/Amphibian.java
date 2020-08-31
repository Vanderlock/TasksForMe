public class Amphibian {
    protected void swim(){
        System.out.println("amphibian swim");
    }
    protected void croak(){
        System.out.println("amphibian croak");
    }
    void eat(){
        System.out.println("amphibian eat");
    }
    static void grow(Amphibian a){
        //this.eat();
        System.out.println("Amphibian grow");
    }

}
