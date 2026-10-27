import java.util.Scanner; 

public class Game {
    private Player p1; 
    private Player p2; 
    private Player currentPlayer; 
    private Dice dice;
    
    private int roundNumber; 
    
    private Scanner kb; 
    
    
    public Game() {
        kb = new Scanner(System.in); 
        
        System.out.println("What is the name for Player 1?"); 
        p1 = new Player(kb.nextLine()); 
        System.out.println("What is the name for Player 2?"); 
        p2 = new Player(kb.nextLine()); 
        currentPlayer = p1; 
        
        dice = new Dice(); 
        
        roundNumber = 1;         
        
        System.out.println("Welcome to Pig Dice ... Don't be greedy"); 
        play(); 
        
    }
    
    private void play() {
        while(true) {
            System.out.println("##### Round " + roundNumber + " #####");
            System.out.println(currentPlayer.getName() + " it is your turn!"); 
            System.out.println("\tRound Points: " + currentPlayer.getRoundPoints()); 
            System.out.println("\tBank Points: " + currentPlayer.getBankPoints());
            dice.roll();
            // Print something like "Brian you rolled a 5 and 3"
            System.out.println(currentPlayer.getName() + " you rolled a " + dice.getRoll());
            
            if(dice.snakeEyes()) {
                System.out.println("Too bad! You rolled double 1s"); 
                System.out.println("Your turn is over, and you lose everything!"); 
                currentPlayer.loseRound(); 
                switchPlayer(); 
            } else if (dice.isDoubles()) {
                System.out.println("Oh no! You rolled doubles!"); 
                System.out.println("Your turn is over, you keep your bank points!"); 
                currentPlayer.rolledDoubleOnes(); 
                switchPlayer(); 
            } else {
                // print You get ## round points
                System.out.println("You get " + dice.getTotal() + " round points"); 
                currentPlayer.addToRound(dice.getTotal());
                // print new round points total is ______ 
                System.out.println("New round points total: " + currentPlayer.getRoundPoints()); 
                rollAgain(); 
            }
            
        }
    }
    
    public void rollAgain() {
        System.out.println("Do you want to roll again? [Y/N]"); 
        String answer = kb.nextLine().toUpperCase(); 
        if(answer.equals("Y")) {
            return; 
        }
    }
    
    
    public void switchPlayer() {
        if(currentPlayer.equals(p1)) {  
            currentPlayer = p2; 
        } else {
            currentPlayer = p1;  
        }
    }
}