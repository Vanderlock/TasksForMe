//Exercise 20: (3) Modify StormyInning.java by adding an UmpireArgument
//exception type and methods that throw this exception. Test the modified hierarchy.



public class Runner {
    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.questionableCall();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        }catch (UmpireArgument e){
            //added
            System.out.println("Umpire argument");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        }catch (ThrownFromGame e){
            //added
            System.out.println("Thrown game");
        }catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
