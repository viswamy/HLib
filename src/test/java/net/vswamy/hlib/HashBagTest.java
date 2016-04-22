/**
 * @author Virupaksha Swamy
 * @alias vswamy
 * @description HashBag - DS similar to HashSet but allowing duplicate items!
 * The maximum number of duplicate items is Integer.MAX_VALUE
 * Time complexity: O(1)
 * Space complexity: O(1)
 */

package net.vswamy.hlib;

import org.junit.Assert;
import org.junit.Test;

public class HashBagTest
{

    HashBag<String> bag = new HashBag<String>();

    @Test
    public void test1()
    {
        for (int i = 0; i < 100; i++)
        {
            for (int k = 0; k < 5; k++)
            {
                bag.add("" + i);
            }
        }
        bag.remove("0");
        bag.remove("1");
        bag.remove("0");
        Assert.assertTrue(bag.size() == 497L);
    }

    @Test
    public void test2()
    {

    }

    @Test
    public void test3()
    {

    }

    @Test
    public void test4()
    {

    }

    @Test
    public void test5()
    {

    }
}
