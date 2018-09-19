package karateChop;

import com.google.common.collect.Lists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
class KarateChopTest {

    private final KarateChop karateChop = new KarateChopRecursive();

    public static Stream<KarateChop> karateChopStream() {
        return Stream.of(new KarateChopRecursive());
    }


    @ParameterizedTest
    @MethodSource("karateChopStream")
    void chop_emptyArray_chopAllTheOptions(KarateChop karateChop) {
        assertEquals(-1, karateChop.chop(1, new ArrayList<Integer>()));
    }

    @ParameterizedTest
    @MethodSource("karateChopStream")
    void chop_oneSizeArray_chopAllTheOptions() {
        assertEquals(-1, karateChop.chop(1, Lists.newArrayList(2)));
        assertEquals(0, karateChop.chop(1, Lists.newArrayList(1)));
    }

    @ParameterizedTest
    @MethodSource("karateChopStream")
    void chop_threeSizeArray_chopAllTheOptions() {
        assertEquals(0, karateChop.chop(1, Lists.newArrayList(1, 3, 5)));
        assertEquals(1, karateChop.chop(3, Lists.newArrayList(1, 3, 5)));
        assertEquals(2, karateChop.chop(5, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, karateChop.chop(0, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, karateChop.chop(2, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, karateChop.chop(4, Lists.newArrayList(1, 3, 5)));
        assertEquals(-1, karateChop.chop(6, Lists.newArrayList(1, 3, 5)));
    }

    @ParameterizedTest
    @MethodSource("karateChopStream")
    void chop_fourSizeArray_chopAllTheOptions() {
        assertEquals(0, karateChop.chop(1, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(1, karateChop.chop(3, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(2, karateChop.chop(5, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(3, karateChop.chop(7, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, karateChop.chop(0, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, karateChop.chop(2, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, karateChop.chop(4, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, karateChop.chop(6, Lists.newArrayList(1, 3, 5, 7)));
        assertEquals(-1, karateChop.chop(8, Lists.newArrayList(1, 3, 5, 7)));
    }
}