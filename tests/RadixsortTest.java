package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class RadixsortTest {

    @Test
    public void testRadixSortInteger() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(170);
        list.add(45);
        list.add(75);
        list.add(90);
        list.add(802);
        list.add(24);
        list.add(2);
        list.add(66);

        Radixsort sort = new Radixsort();
        sort.sort(list);

        assertEquals(Integer.valueOf(2), list.get(0));
        assertEquals(Integer.valueOf(24), list.get(1));
        assertEquals(Integer.valueOf(45), list.get(2));
        assertEquals(Integer.valueOf(66), list.get(3));
        assertEquals(Integer.valueOf(75), list.get(4));
        assertEquals(Integer.valueOf(90), list.get(5));
        assertEquals(Integer.valueOf(170), list.get(6));
        assertEquals(Integer.valueOf(802), list.get(7));
    }
}
