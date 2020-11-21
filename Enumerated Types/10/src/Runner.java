//Exercise 10: (7) Modify class VendingMachine (only) using EnumMap so that one
//program can have multiple instances of VendingMachine.


import enums.Input;

public class Runner {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();
        Generator<Input> gen = new RandomInputGenerator();
        vm1.run(gen);
        vm1.reset();
        vm1.run(gen);
        System.out.println("**************");
        VendingMachine vm2 = new VendingMachine();
        vm2.run(gen);
    }

}
