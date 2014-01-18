package mohitsha.unixtools.lib;

public class UniqLib {
    public String getUniqueLines(String content) {
        String[] lines = content.split("\n");
        StringBuilder uniqueLines = new StringBuilder("");

        for (int index = 0; index < lines.length - 1; index++) {

            if (lines[index].equals(lines[index + 1])) continue;

            uniqueLines.append(lines[index]);
            uniqueLines.append("\n");
        }
        uniqueLines.append(lines[lines.length - 1]);

        return uniqueLines.toString();
    }
}
