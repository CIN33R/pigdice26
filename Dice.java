public class Dice {
    private Die d1; 
    private Die d2; 
    
    public Dice() {
        d1 = new Die(6); 
        d2 = new Die(6);
        //System.out.println(getTotal()); 
    }
    
    public void roll() {
        d1.rollDie();
        d2.rollDie(); 
    }
    
    public int getTotal() {
        return d1.getValue() + d2.getValue();
    }
    
    public boolean isDoubles() {
        return d1.getValue() == d2.getValue(); 
    }
    
    public boolean snakeEyes() {
        return isDoubles() && d1.getValue() == 1; 
    }
    
    public String getRoll() {
        return d1.getValue() + " and " + d2.getValue(); 
    }
}











