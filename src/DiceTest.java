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

        for(int t = 0; t < 1000; t++){
            int t1 = terning1.roll();
            int t2 = terning2.roll();
            System.out.println(t1 + ", " + t2);

            total1 += t1;
            total2 += t2;
        }
        System.out.println("Terning 1 total: " + total1);
        System.out.println("Terning 2 total: " + total2);
    }
}