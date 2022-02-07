package DataStructuresProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        boolean wantToPlay = true;
        int size;
        int range;
        while(wantToPlay){
            System.out.print("How many numbers do you want to guess? ");
            size = scan.nextInt();
            System.out.println();
            System.out.print("Specify the range : 2 to (your choice) ");
            range = scan.nextInt();
            System.out.println();
            GuessingGame newGame = new GuessingGame(size, range);
            newGame.play(newGame, scan);
            System.out.print("Do you want to play again? (true/false): ");
            wantToPlay = scan.nextBoolean();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}
