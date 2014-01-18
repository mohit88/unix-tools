package mohitsha.unixtools.lib;

/**
 * Created by mohitsha on 1/18/14.
 */
public class TailLib {

    public String getLastLines(String content, int noOfLines) {
        StringBuilder lastLines = new StringBuilder("");
        String[] lines = content.split("\n");

        int length = lines.length;
        if (length < noOfLines) noOfLines = length;

        int start = length - noOfLines;

        for (int index = start; index < length; index++)
            lastLines.append(lines[index]);

        return lastLines.substring(0, lastLines.length() - 1);
    }
}
