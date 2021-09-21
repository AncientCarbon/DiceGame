import java.util.*;
public class DiceGame {
    public static void main(String[] args) {
        int total = 0;
        int max = 6;
        int min = 1;
        int kast1 = 0;
        while (total<40) { //buger et while loop til at blive ved med at kaste terninger
            kast1++;
                int terning1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
                //kopieret fra https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
                int terning2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
                //kopieret fra https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
                System.out.println("De to terningekast giver " + terning1 + " og " + terning2);
                System.out.println("Sammenlagt har du slået " + (terning1 + terning2));
                total = total + terning1 + terning2; //total bliver ved med at forstørres,
                // indtil while loopet stopper
                if (total < 40) {
                    System.out.println("Dit nye total er " + total + ". Vil du slå igen? ");
                }
                else {
                    System.out.println("Dit total bliver "+total+". Tillykke, du vandt!");
                    System.out.println("Det tog " + kast1 + " kast at få 40+.");
                    break;
                }
                new Scanner(System.in).nextLine(); //der trykkes enter for at køre loopet igen

        }

    }
}
