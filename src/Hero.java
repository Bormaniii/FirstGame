import java.util.Scanner;

public class Hero {
    String imie;
    String klasa;
    int wiek;
    void setStats(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("witaj, stworz swojego bohatera:\nPodaj jego imie");
        this.imie = scanner.nextLine();
        System.out.println("wybierz klase swojego bohatera\n1.Mag\n2.Wojownik\n3.Cien");
        System.out.println("(wpisz pelna nazwe klasy)");
        this.klasa = scanner.nextLine();
        System.out.println("Podaj wiek swojego bohatera (0-100)");
        this.wiek = scanner.nextInt();
    }
    void showStats(){
        System.out.println("Twoj bohater to " + this.imie + " w wieku " + this.wiek + ", a jego klasa to " + this.klasa);
    }
}
