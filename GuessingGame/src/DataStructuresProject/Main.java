package DataStructuresProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GuessingGame newGame = new GuessingGame(4,9);
        newGame.play(newGame, new Scanner(System.in));
    }
}
