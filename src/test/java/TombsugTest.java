import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Tombsug;

public class TombsugTest {
    Tombsug tombsug;
    @BeforeTest
    public void setUp(){
        this.tombsug= new Tombsug();
    }

    @Test
    public void testCalcRad_30_35(){
        double actual = this.tombsug.calcRadius(30,35);
        double expected = 8.6;
        Assert.assertEquals(actual, expected,0.1);
    }
    @Test
    public void testCalcRad_40_45(){
        double actual = this.tombsug.calcRadius(40,45);
        double expected = 14.142;
        Assert.assertEquals(actual, expected,0.1);
    }
}
