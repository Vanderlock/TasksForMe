import Interfaces.U;

public class B {
    U[] arr;
    B(int i){
        arr = new U[i];
    }
    void addU(U u, int i){
        try {
            arr[i] = u;
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Error: cant add element.");
            e.printStackTrace();
        }

    }
    void eraseU(int i){
        try {
            arr[i] = null;
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Error: cant erase element.");
            e.printStackTrace();

        }

    }
    void testArr(){
        for (U u: arr) {
            if (u != null){
                u.f();
                u.g();
                u.print();
            }

        }
    }
    void showArr(){
        for (U u : arr) {
            if(u != null){
                System.out.println("FULL");
            }else {
                System.out.println("NULL");
            }
        }
    }
}
