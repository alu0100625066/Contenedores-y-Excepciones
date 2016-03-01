package ull.pai.practica3.ejercicio2;

import java.util.ArrayList;
import java.util.Random;

/**
 * The Class SnakeMain is the class that controls the functions of the exercise
 * proposed, in this method we generate 10 snakes with random identification 
 * numbers to add them to an ArrayList, it also implements a way to show all the
 * snakes identification numbers.
 */
public class SnakeMain {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String args[]) {
        final int NUMBER_OF_SNAKES = 10;
        Random randomGenerator = new Random();
        ArrayList<Snake> snakeList = new ArrayList<Snake>();
        for (int i = 0; i < NUMBER_OF_SNAKES; i++) {
            int randomInt = randomGenerator.nextInt(100);
            snakeList.add(new Snake(randomInt));
        }
        for (int i = 0; i < NUMBER_OF_SNAKES; i++) {
            snakeList.get(i).slither();
        }
    }
    
}
