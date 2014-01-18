package mohitsha.unixtools.lib;

import org.junit.Assert;

/**
 * Created by mohitsha on 1/18/14.
 */
public class ReduceSpacesLibTest {
    public void testReduceExtraSpaces() throws Exception {
        ReduceSpacesLib rs = new ReduceSpacesLib();
        String content = "hello     how      are        you       ?";
        String expected = "hello how are you ?";

        String actual = rs.reduceSpaces(content);

        Assert.assertEquals(expected, actual);
    }
}
