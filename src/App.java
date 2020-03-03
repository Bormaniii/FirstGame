import java.util.Scanner;

class Person {
    String imie;
    int wiek;
    boolean stanCywilny;
    int zmienna1;

    void intrance() {
        System.out.println("Nazywam sie " + imie + " mam " + wiek);

    }

    int getWiek() {
        return wiek;
    }

    int getEmerytura() {
        int a = 65 - wiek;
        return a;
    }

    void odliczanie() {

        for (int a = zmienna1; a > 0; a--) {
            System.out.println(a);
        }
    }
}

    class Robot{
        void speak(){
            System.out.println("Hello there, i am speaking method");
        }
        void jumping(int height){
            System.out.println("i am jumping at " + height + "meters far");
        }
        void moving(String direction, int speed, int howLongH, int howLongM){
            System.out.println("I am moving in " + direction + " with " + speed + " km/h for " + howLongH + " hours and " + howLongM + " minutes");
        }
    }
    class Czlowiek{
        void man(String name, String surname, int age, int maritalStatus){
            String maritalStatus1;
            if(maritalStatus == 1){
                maritalStatus1 = "Zamężny";
            }
            else{
                maritalStatus1 = "Kawaler";
            }

            System.out.println("Kandydat to " + name + " " + surname + " w wieku " + age + " o statusie cywilnym " + maritalStatus1);
        }
    }




public class App {


    public static void main(String[] args) {


         Robot jan = new Robot();

         jan.speak();
         jan.jumping(7);
         jan.moving("west", 25, 1, 30);

         Czlowiek Kamilek = new Czlowiek();
         Kamilek.man("Kamil","Borecki", 24, 0);




        String b = "Do Emerytury pozostalo: ";
        Person person1 = new Person();
        person1.imie = "Bartek";
        person1.wiek = 24;
        person1.stanCywilny = false;


        Person person2 = new Person();
        person2.imie = "Pawel";
        person2.wiek = 25;
        person2.stanCywilny = true;


        person1.intrance();
        int ileDoEmerytury = person1.getEmerytura();
        System.out.println(b + ileDoEmerytury);


        person2.intrance();
        int ileDoEmerytury2 = person2.getEmerytura();
        System.out.println(b + ileDoEmerytury2);

        System.out.print("Podaj liczbe startowa: ");
        Scanner scanner = new Scanner(System.in);
        int zmienna1 = scanner.nextInt();

        Person odliczanie = new Person();


        odliczanie.zmienna1 = zmienna1;
        odliczanie.odliczanie();






    }
}

