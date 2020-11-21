//Exercise 9: (5) Modify class PostOffice so that it uses an EnumMap. Project:2
//Specialized languages like Prolog use backward chaining in order to solve problems like this.
//Using PostOffice.java for inspiration, research such languages and develop a program that
//allows new "rules" to be easily added to the system.


public class Runner {
    public static void main(String[] args) {
        for(Mail mail : Mail.generator(10)) {
            System.out.println(mail.details());
            PostOffice.handle(mail);
            System.out.println("*****");
        }
    }
}
