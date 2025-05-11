package at.fhj.msd;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ByLastWordComparatorTest {

    ByLastWordComparator StringThing;

    @BeforeEach
    public void setup() {
        StringThing = new ByLastWordComparator();
    }

    @Test
    @DisplayName("String Test")
    void StringTest() {

        String[] fruits = {"banana", "apple", "green apple", "cherry", "yellow banana", "red cherry"};

        String[] solution = {"apple", "green apple", "banana", "yellow banana", "cherry", "red cherry"};

        Arrays.sort(fruits, StringThing);

        assertArrayEquals(solution, fruits);
    }
}
