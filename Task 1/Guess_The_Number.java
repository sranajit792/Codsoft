import java.util.*;

public class Guess_The_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String RESET = "\u001B[0m";
        String RED_TEXT = "\u001B[31m";
        String GREEN_TEXT = "\u001B[32m";
        String YELLOW_TEXT = "\u001B[33m";
        String BLACK_BG = "\u001B[40m";
        String WHITE_BG = "\u001B[47m";
        int Minimum_Number = 1;
        int Maximum_Number = 100;
        int Maximum_Attempts = 10;
        int score = 0;
        
            
        int Astrick_LineWidth = 50; 
        
                
        for (int i = 0; i < Astrick_LineWidth; i++) {
                System.out.print("*");
            }
        System.out.println(); 
        
                
        System.out.println( RED_TEXT + BLACK_BG +"*       WELCOME TO GUESS THE NUMBER GAME         *"+ RESET);
        
                
        for (int i = 0; i < Astrick_LineWidth; i++) {
            System.out.print("*");
        }
        System.out.println(); 
            
        
        
        
        while (true) {
            int Random_Number = random.nextInt(Maximum_Number - Minimum_Number + 1) + Minimum_Number;
            int attempts = 0;

            System.out.println(GREEN_TEXT + WHITE_BG +"I've selected a number between " + Minimum_Number+ "to " + Maximum_Number + ". Try to guess it!"+ RESET);

            while (attempts < Maximum_Attempts) {
                System.out.print("Enter your guess: ");
                int User_Guess_number = sc.nextInt();
                attempts++;

                if (User_Guess_number == Random_Number) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score=11-attempts;
                    System.out.println(GREEN_TEXT +BLACK_BG +"Score:"+score+"/10"+ RESET);
                    break;
                } else if (User_Guess_number < Random_Number) {
                    System.out.println(YELLOW_TEXT + BLACK_BG +"Too low. "+ RESET);
                } else {
                    System.out.println(YELLOW_TEXT + BLACK_BG +"Too high. "+ RESET);
                }

                if (attempts == Maximum_Attempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + Random_Number);
                    System.out.println(GREEN_TEXT +BLACK_BG +"Score:0/10"+ RESET);
                }
            }
        
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println(RED_TEXT + BLACK_BG +"Thanks for playing the game! Your score is: " + score+ RESET);
                break;
            }
        }

        sc.close();
   }
}