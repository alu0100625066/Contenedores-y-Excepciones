package ull.pai.practica3.ejercicio3;

import java.util.Random;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * The Class SnakeMain is the class that controls the functions of the exercise
 * proposed, in this method we generate snakes with random identification 
 * numbers to add them to a TreeMap, it also implements a way to show all the
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
        TreeMap<String, Snake> snakeList = new TreeMap<String, Snake>();
        Iterator<String> snakeShower;
        String stringKey;
        for (int i = 0; i < NUMBER_OF_SNAKES; i++) {
            int keyGenerator = randomGenerator.nextInt(100);
            stringKey = keyGenerator + "";
            snakeList.put(stringKey, new Snake(keyGenerator));
        }
        snakeShower = snakeList.keySet().iterator();
        while (snakeShower.hasNext()) {
            stringKey = snakeShower.next();
            snakeList.get(stringKey).slither();
        }
    }
    
}
