//version 1.1.0
import java.util.*;
public class DiceTest {
    public static void main(String[] args) {
        Dice terning1 = new Dice(6);
        Dice terning2 = new Dice(6);

        System.out.println("Forventet totalværdi: ~3500");
        System.out.print("Tryk enter for at kaste 1000 gange: ");
        new Scanner(System.in).nextLine();

        int total1 = 0;
        int total2 = 0;
        int face1 = 0;
        int face2 = 0;
        int face3 = 0;
        int face4 = 0;
        int face5 = 0;
        int face6 = 0;

        for(int t = 0; t < 1000; t++){
            int t1 = terning1.roll();
            int t2 = terning2.roll();
            System.out.println(t1 + ", " + t2);

            total1 += t1;
            total2 += t2;

            if (t1 == 1 || t2 == 1){
                if (t1 == 1 && t2 == 1){
                    face1 += 2;
                }
                else face1 += 1;
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
        System.out.println("Terning 1 total: " + total1);
        System.out.println("Terning 2 total: " + total2);

        System.out.println("\nAntal fra hver side:\n 1'ere: " + face1 + "\n 2'ere: " + face2 +
                "\n 3'ere: " + face3 + "\n 4'ere: " + face4 + "\n 5'ere: " + face5 + "\n 6'ere: " + face6);
        int kast = face1 + face2 + face3 + face4 + face5 + face6;
        System.out.println("\nAntal kast i det hele: " + (kast/2));
    }
}