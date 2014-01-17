package mohitsha.unixtools.lib;

import org.junit.Test;

public class HeadLibTest {
    @Test
    void GetStartingTwoLinesFromContent(){
        HeadLib headLib = new HeadLib();
        String content = "hello\nhow\nare\nyou\n?";
        String expected = "hello\nhow";

        String actual = headLib.getStartingLine(content,2);

        Assert.assertEquals(expected,actual);
    }
}
