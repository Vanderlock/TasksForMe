public class Outer {
    class Inner{
        Inner(){
            System.out.println("Inner");
        }
    }
    Outer (){
        System.out.println("Outer");
    }
    Inner makeInner(){
        return new Inner();
    }
}
