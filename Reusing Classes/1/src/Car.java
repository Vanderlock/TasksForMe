public class Car {
    private String body, type, drive;
    private Engine e;
    public Car() {
        System.out.println("Inside Car()");
        body = "SUV";
        type = "Оff-road";
        drive = "Four-wheel";
    }
    public String toString() {
        if(e == null)  // lazy initialization:
            e = new Engine();

        return "body = " + body + ", " +
                "type = " + type + ", " +
                "drive = " + drive + ", " +
                "Engine = " + e;
    }
}
