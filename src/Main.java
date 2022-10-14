import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        boolean point = false;
        String playAgain;
        do {
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("You rolled a " + die1+ " and a " + die2 + ". Your number is " +crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You crapped out. You lose.");
                done = true;
            }

            else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You got a natural and win");
                done = true;
            }
            else {
                System.out.println(crapsRoll + " is now the point. If you roll it again you win, if you roll a 7 you lose.");
                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int crapsRoll2 = die1 + die2;
                    if (crapsRoll == crapsRoll2){
                        System.out.println("You rolled a " + crapsRoll2 + ". You win!");
                        point = true;
                        done = true;
                    } else if (crapsRoll2 == 7) {
                        System.out.println("You rolled a " + crapsRoll2 + ". You lose!");
                        point = true;
                        done = true;
                    } else {
                        System.out.println("You rolled a " + crapsRoll2 + ". Roll again!");
                        point = false;
                    }
                } while (!point);
            }
            System.out.print("Do you want to play again [Y/N]: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N")) {
                done = true;
            }
            else if (playAgain.equalsIgnoreCase("Y"))
            {
                done = false;
            }
        } while (!done);
        }

}