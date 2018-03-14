import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadbike;

    @Before
    public void before(){
        quadbike = new QuadBike( 45, 250);
    }

    @Test
    public void hasAverageSpeed(){
        assertEquals(45, quadbike.getAverageSpeed());
    }

    @Test
    public void hasEngineCapacity(){
        assertEquals(250, quadbike.getEngineCapacity());
    }
}
