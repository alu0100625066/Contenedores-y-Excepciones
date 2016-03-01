package ull.pai.practica3.ejercicio2;

/**
 * @author      Simón Fuertes Sánchez
 * @email       alu0100625066@ull.edu.es
 * @signature   Programación de Aplicaciones Interactivas
 * @version     1.0     29/02/2016
 */
/**
 * The Class Snake is just an implementation that saves an identification number
 * for the snakes.
 */
public class Snake {
    
    /* This class attribute was used on an older version or another way to solve
     * the problem.
     *  private static int snakeNum = 0;      
    */
    
    /** The snake id. */
    private int snakeId;
    
    /* This was the old version of the constructor, we had to make a variable
     * to help us get the actual number of snakes to assign the following                                  
     * identification number to the new snake and to update the current number of 
     * snakes.                                     
     *
    public Snake() {
        int actualStatus = getSnakeNum();
        actualStatus++;
        setSnakeId(actualStatus);
        setSnakeNum(actualStatus);
    }
    */
    
    /**
     * Instantiates a new snake.
     *
     * @param snakeId the snake id is send from the main file being a random id.
     */
    public Snake(int snakeId) {
        setSnakeId(snakeId);
    }

    /* This where the getter and setter methods for the old version attribute
    public static int getSnakeNum() {
        return snakeNum;
    }

    public static void setSnakeNum(int snakeNum) {
        Snake.snakeNum = snakeNum;
    }
    */

    /**
     * Gets the snake id.
     *
     * @return the snake id
     */
    public int getSnakeId() {
        return snakeId;
    }

    /**
     * Sets the snake id.
     *
     * @param snakeId the new snake id
     */
    public void setSnakeId(int snakeId) {
        this.snakeId = snakeId;
    }
    
    /**
     * This metod is used to print in console the identification number of
     * the snake that calls it.
     */
    public void slither() {
        System.out.println("Soy la serpiente número " + getSnakeId());
    }   

}
