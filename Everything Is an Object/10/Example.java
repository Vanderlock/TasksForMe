public class Example{

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("There can be only 3 entered arguments.");
	    System.out.println("You entered " +args.length + " arguments");
        } else {
            for(int i = 0; i < args.length; ++i) {

                System.out.println(args[i]);

            }
        }
    }
}
