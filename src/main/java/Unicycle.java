public class Unicycle extends Vehicle implements IDriveable {
    int numberOfSeats;

    public Unicycle(int averageSpeed, int numberOfSeats){
        super(averageSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
