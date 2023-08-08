public class Board {
    char gameBoard[][] = {{' ', '|',  ' ', '|',' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

    public void printBoard(){
        for(int row = 0; row<this.gameBoard.length; row++){
            System.out.println();
            for (int spot = 0; spot<this.gameBoard[row].length; spot++){
                System.out.print(gameBoard[row][spot]);
            }
        }
    }




}
