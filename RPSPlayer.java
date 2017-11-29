public class RPSPlayer implements Player {
    private String name;
    private String choice;
    private boolean cpu;
    private int score;

    /**
     * Constructor for objects of class RPSPlayer
     */
    public RPSPlayer(boolean computer)
    {
        // initialise instance variables
        this.cpu = computer;
        this.name = setName(cpu);
    }

    /**
     * Returns String of "Rock", "Paper" or "Scissors"
     * Will be random if computer = true
     */
    public void setChoice(boolean computer) {
        if(!cpu) {
            //ask user
            System.out.println("What is your play? (rock, paper, or scissors)");
            this.choice = scan.next();
        }
        else {
            System.out.println("The computer's play is:");
        }
    }
    
    public boolean getCPU() {
        return this.cpu;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void updateScore(int value) {
        this.score += value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getChoice() {
        return this.choice;
    }
    
    public String toString() {
        return "The player " + name + " has choosen " + choice;
    }
    
    /**
     * Set's the player name.  If computer = true, returns "CPU"
     */
    public String setName(boolean computer) {
        if (!cpu) {
            System.out.println("What's your name?");
            this.name = scan.next();
        }
    }
    
    import java.util.Random;
    
     /**
     * If cpu then return a random choice
     */
    public String randomChoice() {
        Random gen = new Random();
        // int otherValue = (int) (3*Math.random()); another way to get int using static math
        int value = gen.nextInt(3);
        if (value ==0) {
            return "rock";
        }
        else if (value ==1) {
            return "paper";
        }
        else {
            return "scissors";
        }
    }
}
