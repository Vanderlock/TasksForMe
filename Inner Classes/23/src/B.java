import Interfaces.U;

public class B {
    U[] arr;
    B(int i){
        arr = new U[i];
    }
    void addU(U u, int i){
        arr[i] = u;
    }
    void eraseU(int i){
        arr[i] = null;
    }
    void testArr(){
        for (U u: arr) {
            u.f();
            u.g();
            u.toString();
        }
    }
    void showArr(){
        for (U u : arr) {
            if(u != null){
                System.out.println(u.toString());
            }else {
                System.out.println("NULL");
            }
        }
    }
}
