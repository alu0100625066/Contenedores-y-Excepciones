package ull.pai.practica3.ejercicio3;

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
    
    /** The static attribute that keeps tracking of the number of snakes. */
    private static int snakeNum = 0;
    /** The snake id. */
    private int snakeId;
    
    /**
     * Default constructor of Snake, update the number of snakes and give a new 
     * id to the snake that is equal to the number of snakes.
     */
    public Snake() {
        int actualStatus = getSnakeNum();
        actualStatus++;
        setSnakeId(actualStatus);
        setSnakeNum(actualStatus);
    }
    
    /**
     * Instantiates a new snake.
     *
     * @param snakeId the snake id is sent from the main file being a random id.
     */
    public Snake(int snakeId) {
        int actualStatus = getSnakeNum();
        actualStatus++;
        setSnakeId(snakeId);
        setSnakeNum(actualStatus);
    }

    /**
     * Gets the total number of snakes.
     *
     * @return the total number of snakes
     */
    public static int getSnakeNum() {
        return snakeNum;
    }

    /**
     * Sets the the total number of snakes.
     */
    public static void setSnakeNum(int snakeNum) {
        Snake.snakeNum = snakeNum;
    }
    
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
     * This method is used to print in console the identification number of
     * the snake that calls it.
     */
    public void slither() {
        System.out.println("Soy la serpiente número " + getSnakeId());
    }   

}
