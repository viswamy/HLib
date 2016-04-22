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
    public void testIntegers()
    {
        Assert.assertEquals(0, bitHandler.countBits(0));
        Assert.assertEquals(1, bitHandler.countBits(1));
        Assert.assertEquals(1, bitHandler.countBits(2));
    }

    @Test
    public void testLongs()
    {
        Assert.assertEquals(0, bitHandler.countBits(0));
        Assert.assertEquals(1, bitHandler.countBits(1));
        Assert.assertEquals(1, bitHandler.countBits(2));
    }

    @Test
    public void setBitForInteger()
    {
        Assert.assertEquals(bitHandler.setNthBit(2,0),3);
        Assert.assertEquals(bitHandler.setNthBit(1,0),1);
        Assert.assertEquals(bitHandler.setNthBit(8,1),10);
        Assert.assertEquals(bitHandler.setNthBit(4,2),4);
        Assert.assertEquals(bitHandler.setNthBit(2,1),2);
    }

    @Test
    public void setBitForLong()
    {

    }
}
