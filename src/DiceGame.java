// version 1.0.0
import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Dice terningX = new Dice(6); //Nyt objekt kaldet terningX laves vha. klassen Dice
        Dice terningY = new Dice(6); //Nyt objekt kaldet terningY laves vha. klassen Dice
        Player player1 = new Player(0);
        Player player2 = new Player(0);
        Scanner in = new Scanner(System.in);
//        String name = Player.name;
        System.out.println("Player 1 skriv dit navn: ");
        player1.name = in.nextLine();
        System.out.println("Player 2 skriv dit navn: ");
        player2.name = in.nextLine();

        while (player1.score < 40 && player2.score < 40) { // Bruger et while loop til at blive ved med at kaste terninger
            int terning1 = terningX.roll();
            // Bruger terningens funktion roll, som er angivet inde i Dice klassen
            int terning2 = terningY.roll();
            int terning3 = terningX.roll();
            int terning4 = terningY.roll();

            System.out.println(player1.name + "'s tur: ");
            new Scanner(System.in).nextLine();


//            player1.score = terningX.roll() + terningY.roll();
//            player2.score = terningX.roll() + terningY.roll();
// Vil gerne ha den til at give mig en int i stedet for fx Dice@814...

            System.out.println(player1.name + " har slået " + terning1 + " og " + terning2);
            System.out.println("Sammenlagt har " + player1.name + " slået " + (terning1 + terning2));
            player1.score += terning1 + terning2; // Total bliver ved med at forstørres,

            if (terning1==terning2){
                if (terning1+terning2==2){
                    System.out.println("selvom du har mistet alle dine point, for du en tur mere");
                }
                terning1 = terningX.roll();
                terning2 = terningY.roll();
                System.out.println("Du har slået to af den samme,du for en ekstra tur.");
                System.out.println(player1.name + "'s tur");
                new Scanner(System.in).nextLine();
                System.out.println(player1.name + " har slået " + terning1 + " og " + terning2);
                System.out.println("Sammenlagt har " + player1.name + " slået " + (terning1 + terning2));
                player1.score += terning1 + terning2;
            }
            System.out.println("\n" + player2.name + "'s tur");
            new Scanner(System.in).nextLine();

            System.out.println(player2.name + " har slået " + terning3 + " og " + terning4);
            System.out.println("Sammenlagt har " + player2.name + " slået " + (terning3 + terning4) + "\n");


            player2.score += terning3 + terning4; // indtil while loopet stopper


            if (terning1 + terning2 == 2){ // Resetter total hvis 2 er slået
                player1.score = 0;

            }
            if (terning3 + terning4 == 2){ // Resetter total hvis 2 er slået
                player2.score = 0;
                System.out.println("Du slog to 1'ere, du har nu mistet alle dine point");

            }

            if (terning3==terning4){
                if (terning3+terning4==2) {
                    System.out.println("Selvom du har mistet alle dine point, får du en tur mere");
                }
                terning3 = terningX.roll();
                terning4 = terningY.roll();
                System.out.println("Du har slået to af den samme,du får en ekstra tur.");
                System.out.println(player2.name + "'s tur");
                new Scanner(System.in).nextLine();
                System.out.println(player2.name + " har slået " + terning3 + " og " + terning4);
                System.out.println("Sammenlagt har " + player2.name + " slået " + (terning3 + terning4) + "\n");
                player2.score += terning3 + terning4;
            }

            if (player1.score < 40 && player2.score < 40) {
                System.out.println(player1.name + " har nu en score på " + player1.score);
                System.out.println(player2.name + " har nu en score på " + player2.score);
                System.out.println("Tryk enter for at slå med terningerne igen");
            } else if (player1.score >= 40){
                System.out.println(player1.name + " har vundet. Din totale score bliver " + player1.score + ". Tillykke, du vandt!");
                break;
            }
            else if (player2.score >= 40){
                System.out.println(player2.name + " har vundet. Din totale score bliver " + player2.score + ". Tillykke, du vandt!");
                break;
            }
            new Scanner(System.in).nextLine(); // Der trykkes enter for at køre loopet igen
        }
    }
}