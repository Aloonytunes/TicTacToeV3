import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    //Board board = new Board();
    private ArrayList<Integer> usedNums = new ArrayList<>();
    private boolean gameOver = false;


    public void p1Turn() {
        winCheck();
        if (gameOver) {
            System.out.println();
            System.out.println("O Wins");
        } else {
            System.out.println();
            System.out.println("Pick a number 1-9");
            Scanner scanner = new Scanner(System.in);
            int p1Input = scanner.nextInt();
            if (!usedNums.contains(p1Input) && (0 < p1Input) && (p1Input <= 9)) {
                usedNums.add(p1Input);
                String inputToBoardPos = Board.posToBoardPos.get(p1Input);
                String[] splitInputToBoardPos = inputToBoardPos.split(",");
                int row = Integer.parseInt(splitInputToBoardPos[0]);
                int col = Integer.parseInt(splitInputToBoardPos[1]);
                Board.gameBoard[row][col] = 'X';
                Board.printBoard();
                p2Turn();
            } else {
                System.out.println("Pick an Available Number Number");
                p1Turn();
            }
        }
    }

    public void p2Turn() {
        winCheck();
        if (gameOver) {
            System.out.println();
            System.out.println("X Wins");
        } else {
            System.out.println();
            System.out.println("Pick a number 1-9");
            Scanner scanner = new Scanner(System.in);
            int p2Input = scanner.nextInt();
            if (!usedNums.contains(p2Input) && (0 < p2Input) && (p2Input <= 9)) {
                usedNums.add(p2Input);
                String inputToBoardPos = Board.posToBoardPos.get(p2Input);
                String[] splitInputToBoardPos = inputToBoardPos.split(",");
                int row = Integer.parseInt(splitInputToBoardPos[0]);
                int col = Integer.parseInt(splitInputToBoardPos[1]);
                Board.gameBoard[row][col] = 'O';
                Board.printBoard();
                p1Turn();
            } else {
                System.out.println("Pick an Available Number");
                p2Turn();
            }
        }
    }

    public void winCheck() {
        if (usedNums.size() == 9) {
            System.out.println();
            System.out.println("Draw");
            System.exit(0);

        }
        //checks rows for wins
        for (int i = 1; i <= 7; i += 3) {
            String inputToBoardPos = Board.posToBoardPos.get(i);
            String[] splitInputToBoardPos = inputToBoardPos.split(",");
            int row = Integer.parseInt(splitInputToBoardPos[0]);
            int col = Integer.parseInt(splitInputToBoardPos[1]);
            if ((Board.gameBoard[row][col] != ' ') && (Board.gameBoard[row][col] == Board.gameBoard[row][col + 2]) &&
                    (Board.gameBoard[row][col + 2] == Board.gameBoard[row][col + 4])) {
                gameOver = true;
            }
        }
        //checks columns for wins
        for (int i = 1; i <= 3; i++) {
            String inputToBoardPos = Board.posToBoardPos.get(i);
            String[] splitInputToBoardPos = inputToBoardPos.split(",");
            int row = Integer.parseInt(splitInputToBoardPos[0]);
            int col = Integer.parseInt(splitInputToBoardPos[1]);
            if ((Board.gameBoard[row][col] != ' ') && (Board.gameBoard[row][col] == Board.gameBoard[row + 2][col]) &&
                    (Board.gameBoard[row + 2][col] == Board.gameBoard[row + 4][col])) {
                gameOver = true;
            }
        }

        if ((Board.gameBoard[2][2] != ' ')) {
            if ((Board.gameBoard[0][0] == Board.gameBoard[2][2]) && (Board.gameBoard[2][2] == Board.gameBoard[4][4]) ||
                    (Board.gameBoard[0][4] == Board.gameBoard[2][2]) && (Board.gameBoard[2][2] == Board.gameBoard[4][0])){
                gameOver = true;
            }
        }
    }
}
