package mohitsha.unixtools.lib;

public class TailLib {

    public String getLastLines(String content, int noOfLines) {
        StringBuilder lastLines = new StringBuilder("");
        String[] lines = content.split("\n");

        int length = lines.length;
        if (length < noOfLines) noOfLines = length;

        int start = length - noOfLines;

        for (int index = start; index < length; index++) {
            lastLines.append(lines[index]);
            lastLines.append("\n");
        }
        return lastLines.substring(0, lastLines.length() - 1);
    }
}
