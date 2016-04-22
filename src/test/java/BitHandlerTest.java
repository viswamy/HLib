import net.vswamy.hlib.BitHandler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vswamy on 4/22/16.
 * Class to test BitHandler!
 */



public class BitHandlerTest
{
    BitHandler bitHandler = BitHandler.INSTANCE;

    @Test
    public void checkForIntegers()
    {
        Assert.assertEquals(0, bitHandler.countBits(0));
        Assert.assertEquals(1, bitHandler.countBits(1));
        Assert.assertEquals(1, bitHandler.countBits(2));
    }
}
