abstract class Inning {
    Inning() throws BaseballException {}
    void event() throws BaseballException {

    }
    abstract void atBat() throws Strike, Foul, UmpireArgument;
    public void questionableCall() throws UmpireArgument {
        //added
    }
    void walk() {}
}
