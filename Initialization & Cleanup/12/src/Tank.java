public class Tank {
    int status = 0;

    public Tank() {
        this(0);
    }

    public Tank(int fullness) {
        status = fullness;
    }

    void pourOut(){
        status = 0;
    }

    void printStatus (){
        if(status ==0 ){
            System.out.println("Tank is empty");
        }else {
            System.out.println("Fullness this tank is: " + status);
        }
    }
    protected void finalize(){
        if (status != 0){
            System.out.println("Some tank is not empty");
        }
    }


}
