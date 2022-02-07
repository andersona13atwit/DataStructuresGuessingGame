package DataStructuresProject;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private LinkedBag<Integer> user;
    private LinkedBag<Integer> game;

    public GuessingGame(int size, int range){
        System.out.println("In this game you select a number of integers to guess and their range (2 to whatever you select)" +
                " The system generates this number of random integers. They are not necessarily distinct " +
                "You will try to guess them in several attempts");
        initializeGame(size, range);
    }

    private void initializeGame(int size, int range){
        user = new LinkedBag<>();
        game = new LinkedBag<>();
        user.setMax(size);
        game.setMax(size);

        Random randint = new Random();
        for (int i = 0; i < size; i++) {
            game.add(randint.nextInt(range));
        }


    }
    private int getSize(){
        return game.getSize();
    }
    private void addFromUser(Integer value){
        user.add(value);
    }
    private int numInstersections(){
        return game.intersection(user).size();
    }
    private void clearUser(){
        user.clear();
    }
    public void play(GuessingGame g, Scanner input){
        System.out.println(game);
        while(numInstersections() != game.getSize()){
            System.out.print("Next number please! ");
            g.addFromUser(input.nextInt());
            System.out.println();
            System.out.println(user);
//            System.out.println(game.getSize() + " " + game.getSize() + " " + (user.getSize()>game.getSize()));
            if(user.getSize() == game.getSize()){
                if(numInstersections() != game.getSize()) {
                    System.out.println("Incorrect!");
                    user.clear();
                }
            }
        }
        System.out.println("You won!");
    }
}
