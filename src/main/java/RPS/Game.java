package RPS;

import java.util.Scanner;

public class Game {
    public void playRound(Player player1, Player player2) {
        System.out.println("Welcome to the rock/scissors/paper game!" + "\n");
        Scanner scanner = new Scanner(System.in);
        String[] words = {"rock", "scissors", "paper"};
        String word = words[(int) (Math.random() * words.length)];

        System.out.println("Please enter your choise: (rock/scissors/paper) ");
        player1.setChoice(scanner.nextLine());
        System.out.println("Your choise: " + player1.getChoice());

        player2.setChoice(word);
        System.out.println("Computer choise: " + player2.getChoice() + "\n");

        String choiseOfP1 = player1.getChoice();
        String choiseOfP2 = player2.getChoice();

        int scoreOfP1 = player1.getScore();
        int scoreOfP2 = player2.getScore();

        int a = (choiseOfP1.equals(choiseOfP2)) ? 1 : 2;
        switch (a) {
            case 1:
                System.out.println("Tie!!!");
                break;
            case 2:
                if (((choiseOfP1.equals("rock") && choiseOfP2.equals("scissors")) || (choiseOfP1.equals("scissors") && choiseOfP2.equals("paper")) || (choiseOfP1.equals("paper") && choiseOfP2.equals("rock")))) {
                    scoreOfP1++;
                    player1.setScore(scoreOfP1);
                } else if (((choiseOfP2.equals("rock") && choiseOfP1.equals("scissors")) || (choiseOfP2.equals("scissors") && choiseOfP1.equals("paper")) || (choiseOfP2.equals("paper") && choiseOfP1.equals("rock")))) {
                    scoreOfP2++;
                    player2.setScore(scoreOfP2);
                }

                System.out.println("Your score: " + scoreOfP1 + "\n" + "Computer's score: " + scoreOfP2 + "\n");
                if (scoreOfP1 > scoreOfP2) {
                    System.out.println("You are winner!");
                } else {
                    System.out.println("Computer is winner");
                }
        }
    }

    public void playGame(Player p1, Player p2) {
        boolean playAgain = false;
        int round = 0;
        while (!playAgain) {

            System.out.println("Do you wanna play? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String userChoise = scanner.nextLine();

            if (userChoise.equals("yes")) {
                playRound(p1, p2);
                round++;
                System.out.println("Round: " + round);
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println();
            } else if (userChoise.equals("no")) {
                System.out.println("Okey! Game was over! ");
                break;
            }
        }
    }
}
