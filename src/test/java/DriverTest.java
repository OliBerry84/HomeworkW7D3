import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    DodgemCar dodgemCar;
    QuadBike quadBike;

    @Before
    public void before(){
        dodgemCar = new DodgemCar(5, 2);
        quadBike = new QuadBike(50,1);
        driver = new Driver("Ricky Bobby", dodgemCar);
    }

    @Test
    public void hasName(){
        assertEquals("Ricky Bobby", driver.getName());
    }

    @Test
    public void getsTimeToDestination(){
        assertEquals(10, driver.driveDistance(50));
    }

    @Test
    public void canSetVehicle(){
        driver.setVehicle(quadBike);
        assertEquals(1, driver.driveDistance(50));
    }
}