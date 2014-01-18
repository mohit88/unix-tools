package mohitsha.unixtools.lib;

import org.junit.Assert;
import org.junit.Test;

public class TailLibTest {
    @Test
    public void testGetLastLinesFromContent() throws Exception {
        TailLib tailLib = new TailLib();
        String content = "hello\nhow\nare\nyou\n?";
        String expected = "you\n?";

        String actual = tailLib.getLastLines(content, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastLinesFromContentMoreThanNoOfLines() throws Exception {
        TailLib tailLib = new TailLib();
        String content = "?";
        String expected = "?";

        String actual = tailLib.getLastLines(content, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastLinesFromEmptyContent() throws Exception {
        TailLib tailLib = new TailLib();
        String content = "";
        String expected = "";

        String actual = tailLib.getLastLines(content, 2);

        Assert.assertEquals(expected, actual);
    }
}
