public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        Logic logic = new Logic();
        board.printBoard();
        board.createObjects();
        logic.fillHash();






         for(int i : logic.posToBoardPos.keySet()){
             System.out.println(i + " : " + logic.posToBoardPos.get(i));

         }

    }

}
