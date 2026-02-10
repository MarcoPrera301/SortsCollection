package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class TimsortTest {

    @Test
    public void testTimSortInteger() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(9);
        list.add(1);

        Timsort<Integer> sort = new Timsort<>();
        sort.sort(list);

        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(4), list.get(1));
        assertEquals(Integer.valueOf(9), list.get(2));
        assertEquals(Integer.valueOf(12), list.get(3));
    }
}


