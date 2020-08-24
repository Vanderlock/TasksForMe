public class Stem extends Root {
    Component1 stem1;
    Component2 stem2;
    Component3 stem3;
    Stem(){
        super();
        System.out.println("Stem ");
        stem1 = new Component1();
        stem2 = new Component2();
        stem3 = new Component3();
    }
    void dispose(){
        stem1.dispose();
        stem2.dispose();
        stem3.dispose();
        super.dispose();
        System.out.println("Stem.dispose()");
    }
}
