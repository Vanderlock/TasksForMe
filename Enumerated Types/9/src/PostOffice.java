import java.util.*;
public class PostOffice {
    enum MailHandler { GENERAL_DELIVERY, MACHINE_SCAN, VISUAL_INSPECTION, FORWARD_STEP, RETURN_TO_SENDER }

    public interface Handler{
        boolean handle(Mail m);
    }

    private static final EnumMap<MailHandler, PostOffice.Handler> em=new EnumMap<>(MailHandler.class);

    static{
        em.put(MailHandler.GENERAL_DELIVERY,new PostOffice.Handler(){
            public boolean handle(Mail m) {
                switch(m.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default: return false;
                }
            }
        });
        em.put(MailHandler.MACHINE_SCAN, new PostOffice.Handler(){
            public boolean handle(Mail m) {
                switch(m.scannability) {
                    case UNSCANNABLE: return false;
                    default:
                        switch(m.address) {
                            case INCORRECT: return false;
                            default:
                                System.out.println("Delivering "+ m + " automatically");
                                return true;
                        }
                }
            }
        });
        em.put(MailHandler.VISUAL_INSPECTION, new PostOffice.Handler(){
            public boolean handle(Mail m) {
                switch(m.readability) {
                    case ILLEGIBLE: return false;
                    default:
                        switch(m.address) {
                            case INCORRECT: return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        });
        em.put(MailHandler.FORWARD_STEP, new PostOffice.Handler(){
            public boolean handle(Mail m) {
                switch(m.forward){
                    case NO:
                        return false;
                    default:
                        switch(m.forwardAddress){
                            case INCORRECT: return false;
                            default:
                                System.out.println("Forward "+ m +" normally");
                                return true;
                        }
                }
            }
        });
        em.put(MailHandler.RETURN_TO_SENDER, new PostOffice.Handler(){
            public boolean handle(Mail m) {
                switch(m.returnAddress) {
                    case MISSING: return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        });
    }


    public static void handle(Mail m) {
        for(Map.Entry<MailHandler,PostOffice.Handler> entry: PostOffice.em.entrySet()){
            if(entry.getValue()!=null){
                if(entry.getValue().handle(m)){
                    return;
                }
            }
        }
        System.out.println(m + " is a dead letter");
    }

//    public static void showHandleMap(){
//        System.out.println(em);
//    }

}
