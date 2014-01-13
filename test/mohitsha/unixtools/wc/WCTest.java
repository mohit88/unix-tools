package mohitsha.unixtools.wc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCTest {
    @Test
    public void testCountLines() throws Exception {
        WC wc = new WC();
        int expected = 6;
        String text = "Hello";

        int characters = wc.countCharacters(text);

        assertEquals(expected,characters);
    }

    @Test
    public void testCountWords() throws Exception {
        WC wc = new WC();
        int expected = 4;
        String text = "Hello How are you";

        int words = wc.countWords(text);

        assertEquals(expected,words);
    }

    @Test
    public void testCountCharacters() throws Exception {
        WC wc = new WC();
        int expected = 2;
        String text = "Hello How are you \n I am fine";

        int lines = wc.countLines(text);

        assertEquals(expected,lines);
    }
}
