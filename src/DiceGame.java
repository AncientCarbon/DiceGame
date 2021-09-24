import java.sql.SQLOutput;
import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Dice terningx = new Dice(6); //Nyt objekt kaldet terningx laves vha. klassen Dice
        Dice terningy = new Dice(6); //Nyt objekt kaldet terningy laves vha. klassen Dice
        Player player1 = new Player(0);
        Player player2 = new Player(0);
        Scanner in = new Scanner(System.in);
//        String name = Player.name;
        System.out.println("Please enter the name of Player 1");
        player1.name = in.nextLine();
        System.out.println("Please enter the name of Player 2");
        player2.name = in.nextLine();

        while (player1.score < 40 && player2.score < 40) { // Bruger et while loop til at blive ved med at kaste terninger
            int terning1 = terningx.roll();
            // Bruger terningens funktion roll, som er angivet inde i Dice klassen
            int terning2 = terningy.roll();
            int terning3 = terningx.roll();
            int terning4 = terningy.roll();

//            player1.score = terningx.roll() + terningy.roll();
//            player2.score = terningx.roll() + terningy.roll();
// Vil gerne ha den til at give mig en int i stedet for fx Dice@814...

            System.out.println(player1.name + " har slået " + terning1 + " og " + terning2);
            System.out.println("Sammenlagt har " + player1.name + " slået " + (terning1 + terning2));
            System.out.println(player2.name + " har slået " + terning3 + " og " + terning4);
            System.out.println("Sammenlagt har " + player2.name + " slået " + (terning3 + terning4));

            player1.score = player1.score + terning1 + terning2; // Total bliver ved med at forstørres,
            player2.score = player2.score + terning3 + terning4; // indtil while loopet stopper


            if (terning1 + terning2 == 2){ // Resetter total hvis 2 er slået
                player1.score = 0;
                System.out.println("Player 1 har nu " + player1.score + " point.");
            }
            if (terning3 + terning4 == 2){ // Resetter total hvis 2 er slået
                player2.score = 0;
                System.out.println("Player 2 har nu " + player2.score + " point.");
            }

            if (player1.score < 40 && player2.score < 40) {
                System.out.println("Sammenlagt har " + player1.name + " nu en score på " + player1.score);
                System.out.println("Sammenlagt har " + player2.name + " nu en score på " + player2.score);
                System.out.println("Tryk enter for at slå med terningerne igen");
            } else if (player1.score >= 40){
                System.out.println("Player 1 har vundet. Din totale score bliver " + player1.score + ". Tillykke, du vandt!");
                break;
            }
            else if (player2.score >= 40){
                System.out.println("Player 2 har vundet. Din totale score bliver " + player2.score + ". Tillykke, du vandt!");
                break;
            }
            new Scanner(System.in).nextLine(); // Der trykkes enter for at køre loopet igen
        }
    }
}