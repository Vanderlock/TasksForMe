//Exercise 33: (3) Repair GenericCast.java using an ArrayList.


public class Runner {

    public static void main(String[] args) {
        SizeStack<String> stringFixedSizeStack = new SizeStack<>();
        for (String s :
                "A B C D E F G H I J".split(" ")) {
            stringFixedSizeStack.push(s);
        }
        int currentCount = stringFixedSizeStack.count();
        for (int i = 0; i < currentCount; i++) {
            String s = stringFixedSizeStack.pop();
            System.out.print(s + " ");
        }
    }
}
