public class Rental {
    private VehicleType vehicleType;
    private int days;

    public Rental(VehicleType vehicleType, int days) {
        this.vehicleType = vehicleType;
        this.days = days;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getDays() {
        return days;
    }

    public int calculateTotalCost() {
        return vehicleType.getDailyRate() * days;
    }

    @Override
    public String toString() {
        return days + " days of " + vehicleType.name() + " - " + calculateTotalCost() + " zł";
    }
}
