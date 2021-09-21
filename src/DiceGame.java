import java.util.*;
public class DiceGame {
    public static void main(String[] args) {
        System.out.println("test");
        int total = 0;
        while (total<40) {
                int max = 6;
                int min = 1;
                int terning1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
                int terning2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("De to terningekast giver " + terning1 + " og " + terning2);
                System.out.println("Sammenlagt har du slået " + (terning1 + terning2));
                total = total + terning1 + terning2;
                if (total < 40) {
                    System.out.println("Dit nye total er " + total + ". Vil du slå igen? ");
                }
                else {
                    System.out.println("Dit total bliver "+total+". Tillykke, du vandt!");
                    break;
                }
                new Scanner(System.in).nextLine();

        }

    }
}
