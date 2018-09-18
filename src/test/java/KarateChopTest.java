import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KarateChopTest {

    @Test
    void chop_emptyArray_chopAllTheOptions() {
        assertEquals(-1, new KarateChop().chop(1, new ArrayList<Integer>()));
    }

    @Test
    void chop_oneSizeArray_chopAllTheOptions() {
        assertEquals(-1, new KarateChop().chop(1, Lists.newArrayList(2)));
        assertEquals(0, new KarateChop().chop(1, Lists.newArrayList(1)));
    }

    @Test
    void chop_threeSizeArray_chopAllTheOptions() {
        assertEquals(0, new KarateChop().chop(1, Lists.newArrayList(1, 3, 5)));
        assertEquals(1, new KarateChop().chop(3, Lists.newArrayList(1, 3, 5)));
        assertEquals(2, new KarateChop().chop(5, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, new KarateChop().chop(0, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, new KarateChop().chop(2, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, new KarateChop().chop(4, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, new KarateChop().chop(6, Lists.newArrayList(1, 3, 5)));
    }

    @Test
    void chop_fourSizeArray_chopAllTheOptions() {
        assertEquals(0, new KarateChop().chop(1, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(1, new KarateChop().chop(3, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(2, new KarateChop().chop(5, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(3, new KarateChop().chop(7, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, new KarateChop().chop(0, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, new KarateChop().chop(2, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, new KarateChop().chop(4, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, new KarateChop().chop(6, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, new KarateChop().chop(8, Lists.newArrayList(1, 3, 5, 7)));
    }
}