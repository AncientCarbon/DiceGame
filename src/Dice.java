public class Dice {
    public int roll(){
        return (int) Math.floor(Math.random()*6+1); //Maksimum værdi på terningen = 6. Minimum værdi på terningen = 1
    }

}
