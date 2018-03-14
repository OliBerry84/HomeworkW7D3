import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemCarTest {

    DodgemCar dodgemCar;

    @Before
    public void before(){
        dodgemCar = new DodgemCar(5,2);
    }

    @Test
    public void hasAverageSpeed(){
        assertEquals(5, dodgemCar.getAverageSpeed());
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(2,dodgemCar.getNumberOfSeats());
    }

}
