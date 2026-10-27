public class Player {
    private String name; 
    private Scorekeeper scorekeeper; 
    
    public Player(String name) {
        this.name = name;
        scorekeeper = new Scorekeeper(); 
    }
    
    public String getName() {
        return name; 
    }
    
    public int getRoundPoints() {
        return scorekeeper.getRoundPoints(); 
    }
    
    public int getBankPoints() {
        return scorekeeper.getBankPoints(); 
    }
    
    public void addToRound(int points) {
        scorekeeper.addToRound(points); 
    }
    
    public void loseRound() {
        scorekeeper.loseEverything(); 
    }
    
    public void rolledDoubleOnes() {
        scorekeeper.loseRound(); 
    }
    
}