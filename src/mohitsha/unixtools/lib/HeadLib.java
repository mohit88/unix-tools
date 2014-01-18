package mohitsha.unixtools.lib;

public class HeadLib {
    public String getStartingLine(String content, int noOfLines){
        StringBuilder startingLines = new StringBuilder("");
        String[] lines = content.split("\n");

        int length = lines.length;
        if(length < noOfLines)noOfLines = length;

        for (int index = 0;index < noOfLines; index++) {
            startingLines.append(lines[index]);
            startingLines.append("\n");
        }

        return startingLines.substring(0,startingLines.length() - 1);
    }
}
