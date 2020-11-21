//Exercise 8: (6) Modify PostOffice.java so it has the ability to forward mail.


import bookExamples.*;

public class Runner {
    public static void main(String[] args) {
        for(Mail mail : Mail.generator(10)) {
            System.out.println(mail.details());
            PostOffice.handle(mail);
            System.out.println("*****");
        }
    }
}
