public class StormyInning extends Inning implements Storm{

    StormyInning() throws RainedOut, BaseballException, UmpireArgument {}
    StormyInning(String s) throws Foul, BaseballException, UmpireArgument {}
    @Override
    public void rainHard() throws RainedOut {}
    @Override
    public void event() {}
    @Override
    public void atBat() throws PopFoul {}
    @Override
    public void questionableCall() throws UmpireArgument, ThrownFromGame {
        //added
        throw new UmpireArgument();
    }


}
