public class Runner {

    static void booleanCompare(String one, String two){
        if (one == null || two == null){
            System.out.println("Can`t compare with null");
        }else {
            System.out.print("Compare " + one + " and " + two + " with operator /==/ ");
            if (one == two){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            System.out.print("Compare " + one + " and " + two + " with operator /!=/ ");
            if (one != two){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            System.out.print("Compare " + one + " and " + two + " with equals ");
            if (one.equals(two)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            System.out.print("Compare " + one + " and " + two + " with /!/ equals ");
            if (!one.equals(two)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            System.out.print("Compare " + one + " and " + two + " with /IgnoreCase/ equals ");
            if (one.equalsIgnoreCase(two)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }

    public static void main(String[] args) {

        booleanCompare("null",null);
        booleanCompare("HELLO","hellO");
        booleanCompare("hello","hello");
    }
}
