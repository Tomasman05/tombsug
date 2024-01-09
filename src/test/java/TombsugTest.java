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
        this.tombsug.calRadius();
    }
}
