import interfaces.FightMMA;

public class Fighter implements FightMMA {
    @Override
    public void fight() {
        System.out.println("Can fight");
    }

    @Override
    public void karate() {
        System.out.println("Can karate");
    }

    @Override
    public void judo() {
        System.out.println("Can judo");
    }

    @Override
    public void mma() {
        System.out.println("Can MMA");
    }
}
