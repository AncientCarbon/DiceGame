public class Dice {
    int sides; //starter med værdien 0
    public Dice(int _sides){
        this.sides = _sides; // sides angives som det givne _sides, som bliver givet i Dicegame-klassen
    }
    public int roll(){ //funktionen roll ruller en terning med x-antal sider
        return (int) Math.floor(Math.random()*this.sides+1); //Maksimum værdi på terningen = 6. Minimum værdi på terningen = 1
        // Maksimum værdi på terningen = 6.
        // Minimum værdi på terningen = 1
    }

}
