public enum VehicleType {
    CAR(100),
    MOTORBIKE(50),
    BICYCLE(20),
    TRUCK(200),
    VAN(150);

    private final int dailyRate;

    VehicleType(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDailyRate() {
        return dailyRate;
    }
}
