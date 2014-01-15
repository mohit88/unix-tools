package mohitsha.unixtools.cut.cutLib;

import java.util.Scanner;

public class CutInputLib {

    private String fileName;
    private boolean fieldCheck;
    private boolean characterCheck;
    private int start;
    private int end;

    public CutInputLib(){
        this.fileName = null;
        this.fieldCheck = false;
        this.characterCheck = false;
        this.start = 0;
        this.end = 0;
    }
    void isOption(String option){
        Scanner scanOption = new Scanner(option).useDelimiter("-");
        if("f".equals(scanOption.next("[cf]{1}"))) this.fieldCheck = true;
        else this.characterCheck = true;
        this.start = scanOption.nextInt();
        this.end = scanOption.nextInt();
    }

    public void getInput(String[] options){
        this.fileName = options[0];
        this.isOption(options[1]);
    }

    public String getFileName(){
        return this.fileName;
    }

    public int getEnd() {
        return this.end;
    }

    public Integer getStart() {
        return this.start;
    }

    public boolean isCharacterCheck() {
        return this.characterCheck;
    }

    public boolean isFieldCheck() {
        return this.fieldCheck;
    }
}