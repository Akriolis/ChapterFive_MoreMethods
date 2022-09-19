/**

TEST-DRIVEN DEVELOPMENT (TDD)
* Write the test code first;
* Develop in iteration cycles;
* Keep the code simple, stupid;
* Refactor (improve the code) whenever and wherever you notice the opportunity;
* Don't release anything until it passes all the tests;
* Don't put in anything that's not in the spec
( no matters how tempted you are to put in functionality "for the future");
* No killer schedules, work regular hours;

 */

/*

* prep code (pseudocode);
* test code;
* real code;

 */

public class Main {

    public static void main(String[] args) {
        /*SimpleStartUp testObj = new SimpleStartUp();

        testObj.setLocationCells(testObj.locations());

        String result = testObj.checkYourself(testObj.userGuess());

        System.out.println(result);*/

        for (int i = 0; i < 4; i++){
            for (int j = 4; j > 2; j--){
                System.out.println(i+ " " + j);
            if (i == 1){
                    i++;
                }
            }
        }

        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++){
            for (int inner = 4; inner > 1; inner --){
                x = x + 3;
                y = y - 2;
                if (x == 6){
                    break;
                }
                x += 3;
            }
            y -= 2;
        }
        System.out.println(x + " "+ y);

    }
}
