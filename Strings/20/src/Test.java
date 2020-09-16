import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    String string;

    public Test(String string) {

        Scanner scanner = new Scanner(string);
        try {
            anInt = scanner.nextInt();
            aLong = scanner.nextLong();
            aFloat = scanner.nextFloat();
            aDouble = scanner.nextDouble();
            this.string = scanner.next("\\w+");
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.err.println("Data must be entered in the correct order: 1)int 2)long 3)float 4)double 5)String");
        }finally {
            scanner.close();
        }



    }

    @Override
    public String toString() {
        return "Test{" +
                "i=" + anInt +
                ", l=" + aLong +
                ", f=" + aFloat +
                ", d=" + aDouble +
                ", s='" + string + '\'' +
                '}';
    }
}
