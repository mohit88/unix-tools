package mohitsha.unixtools.lib;

import org.junit.Assert;
import org.junit.Test;

public class SortLibTest {
    @Test
    public void testSimpleSort() throws Exception {
        String content = "efg\nhij\nabc";
        String expected = "abc\nefg\nhij";

        String actual = new SortLib().simpleSort(content);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseSortingOfLines() throws Exception {
        String content = "efg\nabc\nhij";
        String expected = "hij\nefg\nabc";

        String actual = new SortLib().reverseSort(content);

        Assert.assertEquals(expected, actual);
    }
}