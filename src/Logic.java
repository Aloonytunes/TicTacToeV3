import java.util.HashMap;
import java.util.Scanner;

public class Logic {


    HashMap<Integer, String> posToBoardPos = new HashMap<>();

    
       public void fillHash(){
           addToHash(1, 0, 0);
           addToHash(2, 0, 2);
           addToHash(3, 0, 4);
           addToHash(4, 2, 0);
           addToHash(5, 2, 2);
           addToHash(6, 2, 4);
           addToHash(7, 4, 0);
           addToHash(8, 4, 2);
           addToHash(9, 4, 4);
       }
    public void addToHash(int pos, int row, int col) {
        String boardPos = row + "," + col;
        posToBoardPos.put(pos, boardPos);

    }
}