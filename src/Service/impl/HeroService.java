package Service.impl;

import Model.api.AbstractEntity;
import Model.impl.Hero;
import Service.api.IHeroService;

import java.util.Scanner;

public class HeroService implements IHeroService {
    @Override
    public void setStats(Hero hero){
        Scanner scanner = new Scanner(System.in);
        System.out.println("witaj, stworz swojego bohatera:\nPodaj jego name");
        hero.setName(scanner.nextLine());
        System.out.println("wybierz klase swojego bohatera\n1.Mag\n2.Wojownik\n3.Cien");
        System.out.println("(wpisz pelna nazwe klasy)");
        hero.setHeroClass(scanner.nextLine());
    }

    @Override
    public void showStats(Hero hero){
        System.out.println("Twoj bohater to " + hero.getHeroClass() + ", a na imię mu " + hero.getName() + ".");
    }
}
