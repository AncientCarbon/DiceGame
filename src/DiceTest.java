//version 1.2.2
import java.util.*;
public class DiceTest {
    public static void main(String[] args) {
        Dice terning1 = new Dice(6);
        Dice terning2 = new Dice(6);
        System.out.print("Hvor mange gange vil du kaste de to terninger?: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        System.out.println("Forventet totalværdi: ~" + (7*a/2));
        System.out.println("Forventet antal kast per terning: " + (2*a/6));
        System.out.print("Tryk enter for at kaste " + a + " gange: ");
        new Scanner(System.in).nextLine();

        int total1 = 0; // tjekker hvad den totale værdi af alle terning1 og terning2 kast er
        int total2 = 0;
        int face1 = 0; // face1-6 bruges til at optælle antal af slag af hver øjenværdi.
        int face2 = 0;
        int face3 = 0;
        int face4 = 0;
        int face5 = 0;
        int face6 = 0;

        for(int t = 0; t < a; t++){ // loop kører 1000 gange præcis
            int t1 = terning1.roll();
            int t2 = terning2.roll();
            System.out.println(t1 + ", " + t2);

            total1 += t1;
            total2 += t2;

            if (t1 == 1 || t2 == 1){ // if statement tjekker om der er blevet slået 1
                if (t1 == 1 && t2 == 1){ //hvis begge kast er 1 tilføjer den 2 til antallet af 1'ere slået
                    face1 += 2;
                }
                else face1 += 1; //ellers hvis kun 1 af terningerne er 1, tilføjer den 1 til antallet af 1'ere.
            }
            if (t1 == 2 || t2 == 2){
                if (t1 == 2 && t2 == 2){
                    face2 += 2;
                }
                else face2 += 1;
            }
            if (t1 == 3 || t2 == 3){
                if (t1 == 3 && t2 == 3){
                    face3 += 2;
                }
                else face3 += 1;
            }
            if (t1 == 4 || t2 == 4){
                if (t1 == 4 && t2 == 4){
                    face4 += 2;
                }
                else face4 += 1;
            }
            if (t1 == 5 || t2 == 5){
                if (t1 == 5 && t2 == 5){
                    face5 += 2;
                }
                else face5 += 1;
            }
            if (t1 == 6 || t2 == 6){
                if (t1 == 6 && t2 == 6){
                    face6 += 2;
                }
                else face6 += 1;
            }
        }
        System.out.println("Forventet totalværdi: " + (7*a/2));
        System.out.println("Forventet antal kast per terning: " + (2*a/6));
        System.out.println("\nTerning 1 total: " + total1);
        System.out.println("Terning 2 total: " + total2);

        System.out.println("\nAntal fra hver side:\n1'ere: " + face1 + "\n2'ere: " + face2 +
                "\n3'ere: " + face3 + "\n4'ere: " + face4 + "\n5'ere: " + face5 + "\n6'ere: " + face6);
        int kast = face1 + face2 + face3 + face4 + face5 + face6;
        System.out.println("\nAntal kast i det hele: " + (kast/2)); //dividerer med 2 fordi der kastes 2 terninger pr kast
    }
}