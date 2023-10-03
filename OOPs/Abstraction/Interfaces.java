package Abstraction;

public class Interfaces {
    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();
        Pawns p = new Pawns();
        p.moves();

    }

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    // we need to write public keyword to not make the moves() func default type.
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal");

    }

    Queen() {
        System.out.println("Queen constructor is called first");
    }

}

class Pawns implements ChessPlayer {
    // we need to write public keyword to not make the moves() func default type.
    public void moves() {
        System.out.println("Up, Diagonal");

    }

    Pawns() {
        System.out.println("Pawns constructor is called first");

    }
}

class King implements ChessPlayer {
    // we need to write public keyword to not make the moves() func default type.
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal (1 step)");

    }

}
