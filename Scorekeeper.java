public class Scorekeeper {
    private int roundPoints; 
    private int bankPoints; 

    public Scorekeeper() {
        roundPoints = 0; 
        bankPoints = 0; 
    }

    public int getRoundPoints() {
        return roundPoints; 
    }           

    public int getBankPoints() {
        return bankPoints; 
    }

    public void addToRound(int points) {
        roundPoints = roundPoints + points; 
    }

    public void loseRound() {
        roundPoints = 0; 
    }

    public void bankPoints() {
        bankPoints = bankPoints + roundPoints; 
        roundPoints = 0; 
    }

    public void loseEverything() {
        roundPoints = 0; 
        bankPoints = 0; 
    }
}





