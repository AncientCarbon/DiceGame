import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        int total = 0;
        int kast = 0;
        Dice terning = new Dice(6);
        Dice terningy = new Dice(6);
        while (total < 40) { //bruger et while loop til at blive ved med at kaste terninger
            kast++;
            int terning1 = terning.roll();
            //kopieret fra https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
            int terning2 = terningy.roll();
            //kopieret fra https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
            System.out.println("De to terningekast giver " + terning1 + " og " + terning2);
            System.out.println("Sammenlagt har du slået " + (terning1 + terning2));

            total = total + terning1 + terning2; //total bliver ved med at forstørres,
            // indtil while loopet stopper
            if ((terning1 + terning2) == 2){ //resetter total hvis 2 er slået
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
            new Scanner(System.in).nextLine(); //der trykkes enter for at køre loopet igen
        }
    }
}
