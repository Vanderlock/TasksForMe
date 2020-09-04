public class Cat {
    int weight = 400;

    void f() throws Ex2{
       try {
           g();
       }catch (Ex1 ex1){
           throw new Ex2("Exception2 method f()",ex1);
       }
    }
    void g() throws Ex1{
        throw new Ex1("Exception1 method g()");
    }

}
