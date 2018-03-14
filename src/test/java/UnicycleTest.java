import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicycleTest {

    Unicycle unicycle;

    @Before
    public void before(){
        unicycle = new Unicycle(1,1);
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(1, unicycle.getNumberOfSeats());
    }

    @Test
    public void hasAverageSpeed(){
        assertEquals(1,unicycle.getAverageSpeed());
    }
}
