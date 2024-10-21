import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        while (true) {
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            String computerChoiceString = "";
            switch (computerChoice) {
                case 0:
                    computerChoiceString = "rock";
                    break;
                case 1:
                    computerChoiceString = "paper";
                    break;
                case 2:
                    computerChoiceString = "scissors";
                    break; 

            }

            System.out.println("Computer chose: " + computerChoiceString);

            if (playerChoice.equals(computerChoiceString)) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice.equals("rock") && computerChoiceString.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoiceString.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoiceString.equals("paper"))) {
                System.out.println("You win!"); 

                playerWins++;
            } else {
                System.out.println("Computer wins!");
                computerWins++;
            }

            System.out.println("Score: Player " + playerWins + " - Computer " + computerWins + " - Ties " + ties);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) 
 {
                break;
            }
        }

        scanner.close(); 

    }
}