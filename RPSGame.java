
public class RPSGame implements Game
{
    // instance variables - replace the example below with your own
    public Player pOne;
    public Player pTwo;
    int numPlayers;
   
    /**
     * Constructor for objects of class RPS
     */
    public RPSGame()
    {
        // initialise instance variables
        numPlayers = determineNumberPlayers();
    }
    
    public Player getP1() {
        return pOne;
    }
    
    public Player getP2() {
        return pTwo;
    }
    
    public void setPlayers() {
        
         if (numPlayers == 1) {
            pOne = new RPSPlayer(false); //human player
            pTwo = new RPSPlayer(true); //cpu
        }
        else {
            pOne = new RPSPlayer(false); //human player 1
            pTwo = new RPSPlayer(false); //human player 2
        }
    }
    
     /**
     * Returns 1 or 2 based on how many players are playing RPS
     */
    public int determineNumberPlayers() {
        System.out.println("How many players? (1 or 2)");
        return scan.nextInt();
    }
    
    /**
     * Compare player values and return 1 for p1 win, 0 for tie & -1 for loss
     */
    public int comparePlayers(Player p1, Player p2) {
         if(pOne.getChoice().equals(pTwo.getChoice())) {
            //tie
            return 0;
        }
        else if(pOne.getChoice().equals("rock") && pTwo.getChoice().equals("scissors")) {
            //rock wins
            return 1;
        }
         else if(pOne.getChoice().equals("paper") && pTwo.getChoice().equals("rock")) {
            //paper wins
            return 1;
        }
        
         else if(pOne.getChoice().equals("scissors") && pTwo.getChoice().equals("paper")) {
            //scissors wins
            return 1;
        }
        else {
            //Must have lost
            return -1;
        }
    }
    
    /**
     * Update score based on who wins. Winner will be 1 for player 1 win, 0 for tie and -1 for player 2 win
     */
    public void updateScore(int winner) {
       if (winner == 1){
           pOne.updateScore(1);
        }
        else if (winner == -1) {
            pTwo.updateScore(1);
        }
    }
    
    /**
     * Ask to continue and return true for yes
     */
    public boolean continueGame() {
        System.out.println("Would you like to continue playing? (y/n)");
        String answer = scan.next();
        return scan.next().equals("y");
    }
}
