package mohitsha.unixtools.lib;

import org.junit.Test;

import org.junit.Assert;

public class HeadLibTest {

    @Test
    public void GetStartingTwoLinesFromContent(){
        HeadLib headLib = new HeadLib();
        String content = "hello\nhow\nare\nyou\n?";
        String expected = "hello\nhow";

        String actual = headLib.getStartingLine(content,2);

        Assert.assertEquals(expected,actual);
    }


}