package at.fhj.msd;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CharacterUpperAfterLowerComparatorTest {

    CharacterUpperAfterLowerComparator charThing;

    @BeforeEach
    public void setup() {
        charThing = new CharacterUpperAfterLowerComparator();
    }

    @Test
    @DisplayName("Character Test")
    void CharacterTest() {

        Character[] chars = {'b', '2', 'M', 'n', '4', 'B', 'N', 'm'};

        Character[] solution = {'b', 'm', 'n', 'B', 'M', 'N', '2', '4'};

        Arrays.sort(chars, charThing);

        assertArrayEquals(solution, chars);
    }

    @Test
    @DisplayName("Return values Test - Letters")
    void returnValueLetterTest() {
        //Lower vs Lower
        Character c1 = 'a';
        Character c2 = 'b';

        assertEquals(-1, charThing.compare(c1, c2));
        assertEquals(1, charThing.compare(c2, c1));
        assertEquals(0, charThing.compare(c1, c1));

        //Upper vs Upper
        Character c1Up = 'A';
        Character c2Up = 'B';

        assertEquals(-1, charThing.compare(c1Up, c2Up));
        assertEquals(1, charThing.compare(c2Up, c1Up));
        assertEquals(0, charThing.compare(c1Up, c1Up));

        //Lower and Upper
        Character upper = 'A';
        Character lower = 'b';

        assertEquals(-1, charThing.compare(lower, upper));
        assertEquals(1, charThing.compare(upper, lower));

    }

    @Test
    @DisplayName("Return values Test - Digits")
    void returnValueDigitsTest() {
        // Lower vs Lower
        Character c1 = 'a';
        Character c2 = 'b';

        assertTrue(charThing.compare(c1, c2) < 0); 
        assertTrue(charThing.compare(c2, c1) > 0); 
        assertEquals(0, charThing.compare(c1, c1));

        // Upper vs Upper
        Character c1Up = 'A';
        Character c2Up = 'B';

        assertTrue(charThing.compare(c1Up, c2Up) < 0);
        assertTrue(charThing.compare(c2Up, c1Up) > 0);
        assertEquals(0, charThing.compare(c1Up, c1Up));

        // Lower and Upper
        Character upper = 'A';
        Character lower = 'b';

        assertTrue(charThing.compare(lower, upper) < 0);
        assertTrue(charThing.compare(upper, lower) > 0);
    }

    @Test
    @DisplayName("Return values Test - Integers")
    void returnValueIntegerTest() {

        assertTrue(charThing.compare('1', '5') < 0);  
        assertTrue(charThing.compare('5', '1') > 0);  
        assertEquals(0, charThing.compare('1', '1'));

    }

    @Test
    @DisplayName("Return values Test - Digits and Letters")
    void returnValueDigitsLettersTest() {
        Character c1 = 'A';
        Character c2 = '3';

        assertEquals(-1, charThing.compare(c1, c2));
        assertEquals(1, charThing.compare(c2, c1));

    }

    @Test 
    @DisplayName("Return IllegalArgument")
    void returnIllegalTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            charThing.compare(' ', '3');
        });
    } 
}
