public class GameBoard {
    // size of the board
    int sizeX;
    int sizeY;
    char boardMatrix[][];
    GameBoard(int sizeX , int sizeY){
        // setting the values
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        boardMatrix  = new char[this.sizeX][this.sizeY];
        // creating the board
        for(int i=0;i<this.sizeX;i++){
            for(int j=0;j<this.sizeY;j++){
                boardMatrix[i][j] = '_';
            }

        }
    }
// get the char at xth row and yth column
    public char get(int x , int y){
        return boardMatrix[x][y];
    }
    // set the char at xth row and yth column
    public void set(int x , int y , char c){
        boardMatrix[x][y] = c;
    }

    // print the board
    public void printBoard(){
        for(int i=0;i<this.sizeX;i++){
            for(int j=0;j<this.sizeY;j++){
                System.out.print(boardMatrix[i][j] +" ");
            }
            System.out.println();

        }
    }

}
