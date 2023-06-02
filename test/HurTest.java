import org.testng.Assert;
import org.testng.annotations.Test;

public class HurTest {

    @Test
    public void testCalcArea(){

        Hur hur = new Hur();
        double area = hur.calcArea(30, 35, 40, 45);
        double expected = 1374.772708486752;

        Assert.assertEquals(area, expected);

    }
    
    @Test
    public void testCalcArea2(){

        Hur hur = new Hur();
        double area = hur.calcArea(130, 135, 140, 145);
        double expected = 18874.98344370135;

        Assert.assertEquals(area, expected);

    }
    
}
