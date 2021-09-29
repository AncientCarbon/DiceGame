// version 1.3.0
import java.util.*;

public class DiceGame {
    public static void main(String[] args) {

        Dice terning = new Dice(6); //Nyt objekt kaldet terning laves vha. klassen Dice

        Player player1 = new Player(0);
        Player player2 = new Player(0);

        Scanner in = new Scanner(System.in);

        System.out.println("Player 1 skriv dit navn: ");
        player1.name = in.nextLine();

        System.out.println("Player 2 skriv dit navn: ");
        player2.name = in.nextLine();

        while (player1.score < 40 && player2.score < 40) { // Bruger et while loop til at blive ved med at kaste terninger
            int terning1 = terning.roll();
            int terning2 = terning.roll();
            int terning3 = terning.roll();
            int terning4 = terning.roll();
// Bruger terningens funktion roll, som er angivet inde i Dice klassen

            System.out.println(player1.name + "'s tur: ");
            new Scanner(System.in).nextLine(); //player skal trykke 'enter' for at gå videre i prog.
            new Scanner(System.in).nextLine();

            System.out.println(player1.name + " har slået " + terning1 + " og " + terning2);
            System.out.println("Sammenlagt har " + player1.name + " slået " + (terning1 + terning2));
            player1.score += terning1 + terning2; // Total bliver ved med at forstørres,

            while (terning1 == terning2 && player1.score < 40) {
                if (terning1 + terning2 == 2) {
                    System.out.println("Selvom du har mistet alle dine point, får du en tur mere");
                    player1.score = 0;
                }
                if (terning1 + terning2 == 12) {

                    terning1 = terning.roll();
                    terning2 = terning.roll();

                    System.out.println("Du har slået to 6'ere, du får en ekstra tur, hvis du slår 12 igen, vinder du!");
                    System.out.println(player1.name + "'s tur");

                    new Scanner(System.in).nextLine();

                    System.out.println(player1.name + " har slået " + terning1 + " og " + terning2);
                    System.out.println("Sammenlagt har " + player1.name + " slået " + (terning1 + terning2));

                    player1.score += terning1 + terning2;

                    if (terning1 + terning2 == 12) {
                        System.out.println("Du vandt, " + player1.name); //der skal kastes igen, hvis det bliver 12 igen vinder man
                        break;  //Denne kode er blevet testet, ved at sætte hver terning lig 6
                    }
                } else if ((terning1 + terning2) < 11) {

                    terning1 = terning.roll();
                    terning2 = terning.roll();

                    System.out.println("Du har slået to af den samme,du for en ekstra tur.");
                    System.out.println(player1.name + "'s tur");

                    new Scanner(System.in).nextLine();

                    System.out.println(player1.name + " har slået " + terning1 + " og " + terning2);
                    System.out.println("Sammenlagt har " + player1.name + " slået " + (terning1 + terning2));

                    player1.score += terning1 + terning2;

                    System.out.println(player1.name + " har nu en score på " + player1.score);
                }
            }
            System.out.println("\n" + player2.name + "'s tur");
            new Scanner(System.in).nextLine();

            System.out.println(player2.name + " har slået " + terning3 + " og " + terning4);
            System.out.println("Sammenlagt har " + player2.name + " slået " + (terning3 + terning4) + "\n");


            player2.score += terning3 + terning4; // indtil while loopet stopper


            while (terning3 == terning4 && player2.score < 40) {
                if (terning3 + terning4 == 2) {
                    System.out.println("Selvom du har mistet alle dine point, får du en tur mere");
                    player2.score = 0;
                }
                if (terning3 + terning4 == 12) {

                    terning3 = terning.roll();
                    terning4 = terning.roll();

                    System.out.println("Du har slået to 6'ere, du får en ekstra tur, hvis du slår 12 igen, vinder du!");
                    System.out.println(player2.name + "'s tur");

                    new Scanner(System.in).nextLine();

                    System.out.println(player2.name + " har slået " + terning3 + " og " + terning4);
                    System.out.println("Sammenlagt har " + player2.name + " slået " + (terning3 + terning4));

                    player2.score += terning3 + terning4;
                    if (terning3 + terning4 == 12) {
                        System.out.println("Du vandt, " + player2.name); //der skal kastes igen, hvis det bliver 12 igen vinder man
                        break;
                    }
                } else if ((terning3 + terning4) < 11) {

                    terning3 = terning.roll();
                    terning4 = terning.roll();

                    System.out.println("Du har slået to af den samme,du får en ekstra tur.");
                    System.out.println(player2.name + "'s tur");

                    new Scanner(System.in).nextLine();

                    System.out.println(player2.name + " har slået " + terning3 + " og " + terning4);
                    System.out.println("Sammenlagt har " + player2.name + " slået " + (terning3 + terning4) + "\n");

                    player2.score += terning3 + terning4;

                    System.out.println(player2.name + " har nu en score på " + player2.score);
                }
            }

            if (player1.score < 40 && player2.score < 40) { //hvis ingen har vundet fortsætter loop
                System.out.println(player1.name + " har nu en score på " + player1.score);
                System.out.println(player2.name + " har nu en score på " + player2.score);
                System.out.println("Tryk enter for at slå med terningerne igen");
            } else if (player1.score >= 40) {
                System.out.println(player1.name + " har en score på " + player1.score + ". Nu gælder det om at få to ens");
                //hvis ikke der er et break skal man trykke enter igen for at stoppe program.
            } else if (player2.score >= 40) {
                System.out.println(player2.name + " har en score på " + player2.score + ". Nu gælder det om at få to ens");

            }


        }
        while (player1.score >= 40 && player2.score >= 40) {
            int terning1 = terning.roll();
            int terning2 = terning.roll();
            int terning3 = terning.roll();
            int terning4 = terning.roll();

            System.out.println(player1.name + "'s tur: ");
            new Scanner(System.in).nextLine();

            System.out.println(player1.name + " har slået " + terning1 + " og " + terning2);
            System.out.println("Sammenlagt har " + player1.name + " slået " + (terning1 + terning2));
            player1.score += terning1 + terning2;

            System.out.println("\n" + player2.name + "'s tur");
            new Scanner(System.in).nextLine();

            System.out.println(player2.name + " har slået " + terning3 + " og " + terning4);
            System.out.println("Sammenlagt har " + player2.name + " slået " + (terning3 + terning4) + "\n");

            if (terning1 == terning2) {
                terning1 = terning.roll();
                terning2 = terning.roll();
                new Scanner(System.in).nextLine();
                System.out.println(player1.name + " har nu en score på " + player1.score);
                System.out.println(player2.name + " har nu en score på " + player2.score);

                if (player1.score >= 40) {
                    System.out.println(player1.name + " har vundet. Din totale score bliver " + player1.score + ". Tillykke, du vandt!");
                    break;
                } else if (player2.score >= 40) {
                    System.out.println(player2.name + " har vundet. Din totale score bliver " + player2.score + ". Tillykke, du vandt!");
                    break;
                }
                new Scanner(System.in).nextLine(); // Der trykkes enter for at køre loopet igen
            }
        }
    }
}


