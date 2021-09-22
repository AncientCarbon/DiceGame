import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        int kast = 0;
        Dice terning1 = new Dice(6); //Nyt objekt kaldet terningx laves vha. klassen Dice
        Dice terning2 = new Dice(6); //Nyt objekt kaldet terningy laves vha. klassen Dice
        for (int total = 0; total  < 40; kast++) { // Bruger et while loop til at blive ved med at kaste terninger
            int face1 = terning1.roll();
            // Bruger terningens funktion roll, som er angivet inde i Dice klassen
            int face2 = terning2.roll();
            // Bruger terningy's funktion roll, som er angivet inde i Dice klassen
            int facetotal = face1 + face2;
            System.out.println("De to terningekast giver " + face1 + " og " + face2);
            System.out.println("Sammenlagt har du slået " + facetotal);

            total = total + facetotal; // Total bliver ved med at forstørres,
            // indtil while loopet stopper
            if (facetotal == 2){ // Resetter total hvis 2 er slået
                total = 0;
                System.out.println("Upsi dupsi der røg dine point");
            }
            if (total < 40) {
                System.out.println("Dit nye total er " + total + ". Vil du slå igen? ");
            } else {
                System.out.println("Dit total bliver " + total + ". Tillykke, du vandt!");
                System.out.println("Det tog " + kast + " kast at få 40+.");
                break;
            }
            new Scanner(System.in).nextLine(); // Der trykkes enter for at køre loopet igen
        }
    }
}
