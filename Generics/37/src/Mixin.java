import java.awt.*;

public class Mixin extends BasicImp implements TimeStamped, SerialNumbered{
    TimeStamped timeStamp = new TimeStampedImp();
    SerialNumbered serialNumber = new SerialNumberedImp();
    Colored colored = new ColoredImp();
    public long getStamp() {
        return timeStamp.getStamp();
    }
    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }

    public Color getColor() {
        return colored.getColor();
    }

}
