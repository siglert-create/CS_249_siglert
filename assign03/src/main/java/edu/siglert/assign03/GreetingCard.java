package edu.siglert.assign03;

public class GreetingCard {
    private String[] lines;
    private char boundaryChar;
    public GreetingCard(String [] lines, char boundaryChar){
        setBoundaryChar(boundaryChar);
        setLines(lines);
    }
    public char getBoundaryChar(){
        return boundaryChar;
    }
    public String getLines() {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }
    public void setLines(String [] lines){
        if (lines == null) {
            this.lines = new String[0];
            return;
        }
        this.lines = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            this.lines[i] = lines[i];
        }
    }
    public String generateBoundaryLine(){
        StringBuilder sb = new StringBuilder(51);
        for (int i = 0; i < 50; i++) {
            sb.append(boundaryChar);
        }
        sb.append("\n");
        return sb.toString();
    }
    public String generateCenteredLine(String text){
        if (text == null) text = "";

        if (text.isEmpty()) {
            return generateBoundaryLine();
        }
        String paddedText = " " + text + " ";
        int totalPadding = 50 - paddedText.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;
        StringBuilder sb = new StringBuilder(51 + paddedText.length());
        for (int i = 0; i < leftPadding; i++) sb.append(boundaryChar);
        sb.append(paddedText);
        for (int i = 0; i < rightPadding; i++) sb.append(boundaryChar);
        sb.append("\n");

        return sb.toString();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int totalLines;
        if (lines == null) {
            totalLines = 0;
        } else {
            totalLines = lines.length;
        }
        for (int i = 0; i < totalLines; i += 5) {
            if (!sb.isEmpty()) {
                sb.append("\n");
            }


            sb.append(generateBoundaryLine());
            sb.append(generateBoundaryLine());

            int linesLeft = totalLines - i;
            int lineCount;
            if (linesLeft < 5) {
                lineCount = linesLeft;
            } else {
                lineCount = 5;
            }
            int extraCount = 5 - lineCount;


            for (int j = 0; j < lineCount; j++) {
                String txt = lines[i + j];
                String safeText;
                if (txt == null) {
                    safeText = "";
                } else {
                    safeText = txt;
                }
                sb.append(generateCenteredLine(safeText));
            }


            for (int k = 0; k < extraCount; k++) {
                sb.append(generateBoundaryLine());
            }


            sb.append(generateBoundaryLine());
            sb.append(generateBoundaryLine());
        }


        return sb.toString();
    }
}
