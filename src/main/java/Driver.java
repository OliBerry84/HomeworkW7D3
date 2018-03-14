public class Driver {
    String name;
    IDriveable vehicle;

    public Driver(String name, IDriveable vehicle){
        this.name = name;
        this.vehicle = vehicle;

    }

    public String getName() {
        return name;
    }

    public void setVehicle(IDriveable vehicle) {
        this.vehicle = vehicle;
    }

    public int driveDistance(int distance) {
        return vehicle.driveDistance(distance);
    }
}