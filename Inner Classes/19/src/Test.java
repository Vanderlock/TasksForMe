

public class Test {
    Test(){
        System.out.println("Test");
    }
    public class TestInner{
        TestInner(){
            System.out.println("Test Inner");
        }
        public class TestInnerInner{
            TestInnerInner(){
                System.out.println("Test Inner Inner");
            }
        }
    }
    static class TestNested {
        TestNested() { System.out.println("TestNested"); }
        static class TestNestedNested {
            TestNestedNested() {
                System.out.println("TestNested Nested");
            }
            static class TestNestedNestedNested{
                TestNestedNestedNested(){
                    System.out.println("TestNested Nested Nested");
                }
            }
        }
    }
}
