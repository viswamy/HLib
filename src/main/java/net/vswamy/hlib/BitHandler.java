/**
 * Created by vswamy on 4/22/16.
 * Class to handle all bit operations!
 */

package net.vswamy.hlib;


public enum BitHandler
{
    INSTANCE;

    public int countBits(int n)
    {
        int count = 0;
        while(n > 0)
        {
            count += n % 2;
            n = n / 2;
        }
        return count;
    }

    public int countBits(long n)
    {
        int count = 0;
        while(n > 0)
        {
            count += n % 2;
            n = n / 2;
        }
        return count;
    }

    public int setNthBit(int value, int position)
    {
        return value | (1 << position);
    }

    public long setNthBit(long value, int position)
    {
        return value | (1 << position);
    }

}
