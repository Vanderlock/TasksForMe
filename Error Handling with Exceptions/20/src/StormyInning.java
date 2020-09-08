public class StormyInning extends Inning implements Storm{

    StormyInning() throws RainedOut, BaseballException {}
    StormyInning(String s) throws Foul, BaseballException {}
    @Override
    public void rainHard() throws RainedOut {}
    @Override
    public void event() {}
    @Override
    public void atBat() throws PopFoul, UmpireArgument {
        throw new UmpireArgument();
    }
    @Override
    public void questionableCall() throws UmpireArgument{
        //added
        throw new UmpireArgument();
    }


}
