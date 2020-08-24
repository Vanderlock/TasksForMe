public class Root {
    Component1 root1;
    Component2 root2;
    Component3 root3;
    Root(){
        System.out.println("root ");
        root1 = new Component1();
        root2 = new Component2();
        root3 = new Component3();
    }
    void dispose(){
        root1.dispose();
        root2.dispose();
        root3.dispose();
        System.out.println("Root.dispose()");
    }
}
