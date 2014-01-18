package mohitsha.unixtools.lib;

import org.junit.Assert;
import org.junit.Test;

public class ReduceSpacesLibTest {

    @Test
    public void testReduceExtraSpaces() throws Exception {
        ReduceSpacesLib rs = new ReduceSpacesLib();
        String content = "hello     how      are        you       ?";
        String expected = "hello how are you ?";

        String actual = rs.reduceSpaces(content);

        Assert.assertEquals(expected, actual);
    }
}
