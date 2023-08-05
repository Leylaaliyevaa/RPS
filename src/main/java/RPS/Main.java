package RPS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Leyla", 0, "");
        Player player2 = new Player("Computer", 0, "");
        Game rpsGame = new Game();
        rpsGame.playGame(player1, player2);


    }
}
