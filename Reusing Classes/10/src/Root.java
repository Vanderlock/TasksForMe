import components.Component1;
import components.Component2;
import components.Component3;

public class Root {
//    Component1 root1;
//    Component2 root2;
//    Component3 root3;
    Root(float f){
        new Component1((byte) 0);
        new Component2((short) 0);
        new Component3(0);
        System.out.println("Root float");
    }
}
