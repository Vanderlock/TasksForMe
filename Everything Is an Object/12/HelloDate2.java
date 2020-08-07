import java.util.*; 
 
/** The first Thinking in Java example program.
  * Displays a string and today’s date.
  * @author Valentin Gromyko
  * @author Valendor70@gmail.com
  * @version 2.0
 */ 
public class HelloDate {
   /** Entry point to class & application.
    * @param args array of string arguments
    * @throws exceptions No exceptions thrown
   */   
public static void main(String[] args) {
     System.out.println("Hello, it’s: ");
     System.out.println(new Date());
   } 
}