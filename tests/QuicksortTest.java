package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class QuicksortTest {

    @Test
    public void testQuickSortInteger() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(1);
        list.add(6);
        list.add(3);

        Quicksort<Integer> sort = new Quicksort<>();
        sort.sort(list);

        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
        assertEquals(Integer.valueOf(6), list.get(2));
        assertEquals(Integer.valueOf(9), list.get(3));
    }
}
