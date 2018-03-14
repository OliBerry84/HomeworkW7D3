public abstract class Vehicle {
    int averageSpeed;

    public Vehicle(int averageSpeed){
        this.averageSpeed = averageSpeed;
    }

    public int getAverageSpeed() {
        return this.averageSpeed;
    }

    public int driveDistance(int distance) {
        return distance/averageSpeed;
    }
}