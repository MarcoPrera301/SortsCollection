package tests;
import src.Mergesort;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class MergesortTest {

    @Test
    public void testMergeSortInteger() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(7);
        list.add(4);

        Mergesort<Integer> sort = new Mergesort<>();
        sort.sort(list);

        assertEquals(Integer.valueOf(2), list.get(0));
        assertEquals(Integer.valueOf(4), list.get(1));
        assertEquals(Integer.valueOf(7), list.get(2));
        assertEquals(Integer.valueOf(10), list.get(3));
    }
}
