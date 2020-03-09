import java.util.Scanner;

class Hero{
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

class Fight{
    void easy(){
        String atak2;
        System.out.println("Przed toba walka\nWybierz swoj atak");
        System.out.println("(podaj 1 2 lub 3)\n1.Rzut czaru\n2.Cios mieczem\n3.Pomsta zmarlych");
        Scanner scan = new Scanner(System.in);
        int atak = scan.nextInt();
        if(atak == 1){
             atak2 = "Rzut czaru";
        }
        else if(atak ==2){
            atak2 = "Cios mieczem";
        }
        else{
            atak2 = "Pomsta zmarlych";
        }
        System.out.println("Wybrales " + atak2);
        System.out.println("wygrales ta walke");

    }
    void medium(){
        //in future
    }
    void hard(){
        //in future
    }
}

public class Main {


    public static void main(String[] args) {

        Hero Stats = new Hero();
        Stats.setStats();
        Stats.showStats();

        Fight fight = new Fight();
        fight.easy();

    }
}

