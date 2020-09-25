public class PowerSteeringBelt  extends Belt {
    public static class Factory implements typeinfo.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
