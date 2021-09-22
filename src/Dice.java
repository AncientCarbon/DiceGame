public class Dice {
    int sides;
    public Dice(int _sides){
        this.sides = _sides;
    }
    public int roll(){
        return (int) Math.floor(Math.random()*this.sides+1);
        // Maksimum værdi på terningen = 6.
        // Minimum værdi på terningen = 1
    }

}
