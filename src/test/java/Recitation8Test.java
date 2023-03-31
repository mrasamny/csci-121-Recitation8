import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recitation8Test {

    @Test
    void lastItemReachable() {
        int[] hop1 = {0};
        assertTrue(Recitation8.lastItemReachable(hop1));
        hop1[0] = 2;
        assertTrue(Recitation8.lastItemReachable(hop1));

        int[] hop2 = {0, 2};
        assertFalse(Recitation8.lastItemReachable(hop2));

        int[] hop3 = {1, 2, 0, 2, 1, 0};
        assertTrue(Recitation8.lastItemReachable(hop3));

        int[] hop4 = {1, 2, 0, 3, 1, 0};
        assertFalse(Recitation8.lastItemReachable(hop4));
    }

    @Test
    void slidingWindowMinTest() {
        int[] lst = {2, 8, -3, 5, 4};

        int[] expected1 = {-3, -3, -3};
        assertArrayEquals(expected1, Recitation8.slidingWindowMin(lst,3));

        int[] expected2 = {-3, -3};
        assertArrayEquals(expected2, Recitation8.slidingWindowMin(lst,4));

        int[] expected3 = {-3};
        assertArrayEquals(expected3, Recitation8.slidingWindowMin(lst,5));

        int[] expected4 = {};
        assertArrayEquals(expected4, Recitation8.slidingWindowMin(lst,6));


    }
}