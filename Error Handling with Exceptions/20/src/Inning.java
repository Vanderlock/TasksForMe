abstract class Inning {
    Inning() throws BaseballException {}
    void event() {

    }
    abstract void atBat() throws Strike, Foul, UmpireArgument;
    public void questionableCall() throws UmpireArgument {
        //added
    }
    void walk() {}
}
