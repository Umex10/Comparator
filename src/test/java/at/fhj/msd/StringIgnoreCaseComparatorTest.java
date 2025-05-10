package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringIgnoreCaseComparatorTest {

    StringIgnoreCaseComparator ig;

    @BeforeEach
    public void setup() {
        ig = new StringIgnoreCaseComparator();
    }

    @Test
    @DisplayName("String Test")
    void StringTest() {
        String s1 = "Umejr";
        String s2 = "letsgo";

        assertEquals(9, ig.compare(s1, s2));
    }

}
