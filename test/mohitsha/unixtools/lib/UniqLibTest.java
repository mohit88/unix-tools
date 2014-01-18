package mohitsha.unixtools.lib;

import org.junit.Assert;
import org.junit.Test;

public class UniqLibTest {
    @Test
    public void testGetUniqueLines() throws Exception {
        String content = "hello\nhello\nhello\nhow\nhow\nhow";
        String expected = "hello\nhow";

        String actual = new UniqLib().getUniqueLines(content);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetUniqueLinesOfEmptyContents() throws Exception {
        String content = "";
        String expected = "";

        String actual = new UniqLib().getUniqueLines(content);

        Assert.assertEquals(expected, actual);
    }

}
