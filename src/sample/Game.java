package sample;


public class Game {

    private Field field;

    private State state;

    public Field getField() {
        return field;
    }


    public Game() {

        this.state = State.READY;
    }

        public void start() {

        if (state == State.READY) {
            this.state = State.RUNNING;


            field = new Field();
            field.shuffle();
        }

    }

    public void endGame() {
        if (state == State.RUNNING) {
            this.state = State.GAME_OVER;
            field = null;
        }
    }

    public void resetGame() {


        if (state != State.READY) {
            this.state = State.READY;
            field = null;
        }

    }

    public void nextMove(int code) {
        if (state == State.RUNNING) {
            field.toggleTiles(code); // change the number
            field.print();

            if (field.isWinner()) {
                // System.out.println(" You are winner  this game ");
                endGame();
            }
        }


    }

}
