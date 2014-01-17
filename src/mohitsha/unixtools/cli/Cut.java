package mohitsha.unixtools.cli;


import mohitsha.myIOStream.MyFileReader;
import mohitsha.unixtools.lib.CutInputLib;

public class Cut {

    public static void main(String[] args) {

        CutInputLib cutInput = new CutInputLib();
        cutInput.getInput(args);
        String output = null;
        String fileContent = new MyFileReader().readFile(cutInput.getFileName());
        if(cutInput.isFieldCheck()) output = cutInput.getOnlyFields(fileContent);
        System.out.println(output);
    }
}