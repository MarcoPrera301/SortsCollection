package tests;
import src.Gnomesort;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class GnomesortTest {

    @Test
    public void testGnomeSortInteger() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);

        Gnomesort<Integer> sort = new Gnomesort<>();
        sort.sort(list);

        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
        assertEquals(Integer.valueOf(5), list.get(2));
        assertEquals(Integer.valueOf(8), list.get(3));
    }
}
