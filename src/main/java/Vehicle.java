public class Vehicle {
    int averageSpeed;

    public Vehicle(int averagespeed){
        this.averageSpeed = averageSpeed;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public int driveDistance(int distance) {
        return distance/averageSpeed;
    }
}