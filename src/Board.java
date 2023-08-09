public class Board {
public Piece[] board;
Logic logic = new Logic();
    char gameBoard[][] = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

    public void printBoard() {
        for (int row = 0; row < this.gameBoard.length; row++) {
            System.out.println();
            for (int spot = 0; spot < this.gameBoard[row].length; spot++) {
                System.out.print(gameBoard[row][spot]);
            }
        }
    }

    public void createObjects() {
        board = new Piece[9];
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            board[i] = new Piece(pieceProperties.undefined, i+1);

        }

    }


}
