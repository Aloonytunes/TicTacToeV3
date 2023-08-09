public class Piece {


    pieceProperties state;
    int pos;

    public Piece(pieceProperties state, int pos){
        this.state = state;
        this.pos = pos;
    }


    public pieceProperties getState() {

        return this.state;
    }

    public int getPos() {

        return this.pos;
    }

    public void setPos(int pos) {

        this.pos = pos;
    }

    public void setState(pieceProperties state) {
        this.state = state;
    }


}





