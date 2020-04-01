import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Hero Stats = new Hero();
        Stats.setStats();
        Stats.showStats();

        Fight fight = new Fight();
        fight.easy();

    }
}