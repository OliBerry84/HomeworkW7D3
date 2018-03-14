public class QuadBike implements IDriveable {
    int averageSpeed;
    int engineCapacity;

    public QuadBike( int averageSpeed, int engineCapacity ){
        this.averageSpeed = averageSpeed;
        this.engineCapacity = engineCapacity;

    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int driveDistance(int distance) {
        return distance/averageSpeed;
    }

}




