public class SerialNumberedImp implements SerialNumbered{
    static long counter = 1;
    final long serialNumber = counter++;
    public long getSerialNumber() { return serialNumber; }
}
