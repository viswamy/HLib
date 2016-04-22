/**
 * @author Virupaksha Swamy
 * @alias vswamy
 * @description HashBag - DS similar to HashSet but allowing duplicate items!
 * The maximum number of duplicate items is Integer.MAX_VALUE
 * Time complexity: O(1)
 * Space complexity: O(1)
 */

package net.vswamy.hlib;

import java.util.HashMap;

public class HashBag<T>
{
    HashMap<T, Integer> map = null;
    private static Integer DEFAULT_CAPACITY = 16;
    private static float DEFAULT_LOAD_FACTOR = 0.75f;

    private Long size;

    private void initializeMap(int capacity, float loadFactor)
    {
        this.size = 0L;
        map = new HashMap<T, Integer>(capacity, loadFactor);
    }

    public HashBag()
    {
        this.initializeMap(HashBag.DEFAULT_CAPACITY,
                HashBag.DEFAULT_LOAD_FACTOR);
    }

    public HashBag(int capacity)
    {
        this.initializeMap(capacity, HashBag.DEFAULT_LOAD_FACTOR);
    }

    public HashBag(int capacity, float loadFactor)
    {
        this.initializeMap(capacity, loadFactor);
    }

    public void add(T element)
    {
        if (map.containsKey(element))
        {
            Integer count = map.get(element);
            map.put(element, count + 1);
        }
        else
        {
            map.put(element, 1);
        }
        this.size++;
    }

    public boolean contains(T element)
    {
        if (map.containsKey(element))
            return true;
        return false;
    }

    public void remove(T element)
    {
        if (map.containsKey(element))
        {
            Integer count = map.get(element);
            if (count == 1)
            {
                map.remove(element);
            }
            else
            {
                map.put(element, count - 1);
            }
            this.size--;
        }
    }

    public Long size()
    {
        return this.size;
    }
}
