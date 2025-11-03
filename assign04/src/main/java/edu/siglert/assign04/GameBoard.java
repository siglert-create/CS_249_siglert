package edu.siglert.assign04;

public class GameBoard {
    private char[][] board;
    private char fillChar;
    private int rowCnt;
    private int colCnt;
    public GameBoard(int rowCnt, int colCnt, char fillChar){
        this.rowCnt=rowCnt;
        this.colCnt=colCnt;
        this.fillChar=fillChar;
        board= new char[rowCnt][colCnt];
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                board[i][j] = fillChar;
            }
        }
    }
    public void clear(){
        for (int r = 0; r < rowCnt; r++) {
            for (int c = 0; c < colCnt; c++) {
                board[r][c] = fillChar;
            }
        }
    }
    public int getRowCnt(){

        return rowCnt;
    }
    public int getColCnt(){
        return colCnt;
    }
    public boolean isValidPosition(int row, int col){
        if(row>=0 && row < rowCnt && col >=0 && col < colCnt){
            return true;
        }
        else {
            return false;
        }

    }
    public char getPos(int row, int col){
       if (isValidPosition(row, col)){
           return board[row][col];
       }else {
           return ' ';
       }
    }
    public boolean setPos(int row, int col, char c){
        if (isValidPosition(row, col)){
            board[row][col]=c;
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return rowCnt + " x " + colCnt + " GameBoard (default: " + fillChar + ")";
    }
    public String getBoardString(){
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < rowCnt; r++) {
            for (int c = 0; c < colCnt; c++) {
                sb.append(board[r][c]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

