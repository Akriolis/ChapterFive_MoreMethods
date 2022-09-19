import java.util.Random;
import java.util.Scanner;

public class SimpleStartUp {

    private int[] locationCells = new int[7];

    private int numOfHits = 0;

    private int numOfGuesses = 0;

    boolean isAlive = true;

    public void setLocationCells (int [] x) {
        locationCells = x;
    }

    public int[] locations (){

        int randomInt = (int) (Math.random() * 5);
        int[] locations = {randomInt, randomInt+1, randomInt+2};
        return locations;

        }


    public int userGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your guess for a cell");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public String checkYourself(int userGuess) {
        String result = "miss";

        while (isAlive) {
            numOfGuesses++;
            for (int cell : locationCells) {
                if (userGuess == cell) {
                    result = "hit";
                    numOfHits++;

                } else if (numOfHits == locationCells.length) {
                    result = "kill";
                    /*isAlive = false;*/
                }
            }
        }return result;
    }
}