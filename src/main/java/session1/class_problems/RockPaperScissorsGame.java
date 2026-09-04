package session1.class_problems;

import java.util.Random;

/**
 * Problem 1: Rock-Paper-Scissors Game
 * Plays N rounds between player and computer, prints a summary table
 * of Wins/Losses/Draws and the player's win percentage.
 */
public class RockPaperScissorsGame {

    /**
     * Determines the winner of one round.
     * @return "Player Wins", "Computer Wins", or "Draw"
     */
    static String playRound(String playerMove, String computerMove) {
        // TODO: implement Rock-Paper-Scissors rules
        return "";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int rounds = 5;

        int wins = 0, losses = 0, draws = 0;

        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i = 1; i <= rounds; i++) {
            String playerMove = moves[random.nextInt(3)]; // TODO: replace with real/demo input
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);

            // TODO: tally wins/losses/draws based on result
            System.out.println(i + " | " + playerMove + " | " + computerMove + " | " + result);
        }

        double winPercent = rounds == 0 ? 0 : (wins * 100.0) / rounds;
        System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws
                + " | Win % = " + winPercent);
    }
}
