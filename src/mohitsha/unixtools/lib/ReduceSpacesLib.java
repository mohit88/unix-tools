package mohitsha.unixtools.lib;

public class ReduceSpacesLib {
    public String reduceSpaces(String content) {
        return content.replaceAll("\\s+", " ");
    }
}