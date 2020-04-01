import java.util.Scanner;

public class Fight {
    void easy(){
        String attack2 = null;
        System.out.println("Przed toba walka\nWybierz swoj atak");
        System.out.println("(podaj 1 2 lub 3)\n1.Rzut czaru\n2.Cios mieczem\n3.Pomsta zmarlych");
        Scanner scan = new Scanner(System.in);
        int attack = scan.nextInt();
        if(attack == 1){
            attack2 = "Rzut czaru";
        }
        else if(attack == 2){
            attack2 = "Cios mieczem";
        }
        else if(attack == 3){
            attack2 = "Pomsta zmarlych";
        }
        else{
            System.out.println("wybrales zly  numer ataku");
        }
        System.out.println("Wybrales " + attack2);
        System.out.println("wygrales ta walke");
        /* system walki jako zbior ciosow dla danej nacji w tablicy, kolumna klasa i w wierszasz pod spodem ataki
        randomowo przyjmowana pola 3 ciosow z puli, wybrac mozna 1 pokazane sily ataku przy nazwie
        dana wielkosc wroga
        atak odejmuje pewna wartosc zycia
        jezeli 0 lub ponizej 0 to wygrana


        mozna dodac zloto po wygranej walce
         */

    }
    void medium(){
        //in future
    }
    void hard(){
        //in future
    }
}
