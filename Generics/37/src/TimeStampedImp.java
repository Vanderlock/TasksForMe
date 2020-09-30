import java.util.Date;

public class TimeStampedImp  implements TimeStamped{
    final long timeStamp;
    TimeStampedImp() {
        timeStamp = new Date().getTime();
    }
    public long getStamp() { return timeStamp; }
}
