public class Frog extends Amphibian{
    @Override
    protected void swim(){
        System.out.println("frog swim");
    }
    @Override
    protected  void croak(){
        System.out.println("frog croak");
    }
    @Override
    void eat(){
        System.out.println("frog eat");
    }

    static void grow(Amphibian a){

        System.out.println("Frog grow");

    }
}