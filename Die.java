public class Die {
    private int numberSides; 
    private int value; 
    
    public Die(int numberSides) {
        this.numberSides = numberSides; 
        value = (int)(Math.random() * numberSides) + 1; 
    }
    
    public int rollDie() {
        value = (int)(Math.random() * numberSides) + 1; 
        return value; 
    }
    
    public int getValue() {
        return value; 
    }
}