
/**
 * Write a description of class RPSDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RPSDriver
{
    public static void main(String[] args) {
        Game myRPS = new RPSGame();  //Game is an interface RPSGame is a class
        
        myRPS.setPlayers();
        Player pOne = myRPS.getP1();
        Player pTwo = myRPS.getP2();
        while(myRPS.continueGame()) {
            pOne.setChoice(pOne.getCPU());
            pTwo.setChoice(pTwo.getCPU());
            int win  = myRPS.comparePlayers(pOne, pTwo);
            //Print results
            System.out.println(pOne+ "\n" + pTwo); //toString in RPSPlayer
            
            myRPS.updateScore(win);
            System.out.println("The score for " + pOne.getName() + " is: " + pOne.getScore());
            System.out.println("The score for " + pTwo.getName() + " is: " + pTwo.getScore());
            System.out.println();
        }
        System.out.println();
        System.out.println("Thank you for playing.  The final score is: \n" + pOne.getName() + ":\t" + pOne.getScore());
        System.out.println(pTwo.getName()+ ": \t" + pTwo.getScore());
    }
}
