//
//Exercise 19:   (2) Create a class containing an inner class that itself contains an inner class.
// Repeat this using nested classes. Note the names of the .class files produced by the compiler






public class Runner {
    public static void main(String[] args) {
        Test.TestNested testNested = new Test.TestNested();
        Test.TestNested.TestNestedNested testNestedNested = new Test.TestNested.TestNestedNested();
        Test.TestNested.TestNestedNested.TestNestedNestedNested testNestedNestedNested = new Test.TestNested.TestNestedNested.TestNestedNestedNested();



        Test test = new Test();
        Test.TestInner testInner = test.new TestInner();
        Test.TestInner.TestInnerInner testInnerInner = testInner.new TestInnerInner();
    }
}
