import Model.api.AbstractEntity;
import Model.impl.Hero;
import Service.impl.HeroService;

public class Main {

    public static void main(String[] args) {
        HeroService heroService = new HeroService();
        Hero hero = new Hero();

        heroService.setStats(hero);
        heroService.showStats(hero);

        Fight fight = new Fight();
        fight.easy();

    }
}