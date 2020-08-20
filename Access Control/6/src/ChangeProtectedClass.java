public class ChangeProtectedClass {
    static void change (ProtectedClass pc, String name, int age) {
        pc.age = age;
        pc.name = name;
    }
}
