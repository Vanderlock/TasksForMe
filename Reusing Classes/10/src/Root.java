import components.Component1;
import components.Component2;
import components.Component3;

public class Root {
    Component1 root1;
    Component2 root2;
    Component3 root3;
    Root(float f){
        root1 = new Component1((byte) 0);
        root2 = new Component2((short) 0);
        root3 = new Component3(0);
        System.out.println("Root float");
    }
}
