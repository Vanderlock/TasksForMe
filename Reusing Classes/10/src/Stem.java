import components.Component1;
import components.Component2;
import components.Component3;

public class Stem extends Root {
//    Component1 stem1;
//    Component2 stem2;
//    Component3 stem3;
    Stem(double d){
        super(3.14F);
        new Component1((byte)1);
        new Component2((short)1);
        new Component3(1);
        System.out.println("Stem double");
    }
}
