package Projekt;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Human bohater = new Human();
        Scanner scan = new Scanner(System.in);
        System.out.println("Crown Of The Unknown");
        System.out.println("--------");
        System.out.println("Witaj w tej krótkiej grze tekstowej, która ma za zadanie pokazać Ci, że jedyną granicą jaką mamy jest wyobraźnia.");
        System.out.println("-----------------------------------------");
        System.out.println("Jak masz na imię podróżniku?");
        String Nazwa = scan.nextLine();
        bohater.setImie(Nazwa);
        System.out.println("Jak masz na nazwisko podróżniku?");
        String Vorname = scan.nextLine();
        bohater.setNazwisko(Vorname);
        System.out.println("Jakiej jesteś rasy? (Orki, Krasnolud, Elf, Goblin, Demon)");
        String rasa = scan.nextLine();
        bohater.setKlasa(rasa);
        System.out.println("Twój bohater nazywa się: " + bohater.getImie() + " " + bohater.getNazwisko() + " i jesteś " + bohater.getKlasa() + "em");
        System.out.println("-----------------------------------------");
        System.out.println("Budzisz się w ciemnym miejscu, widzisz światła w cztarech kolorach po różnych stronach:");
        System.out.println("Na Północy - Zielony;");
        System.out.println("Na Zachodzie - Niebieski;");
        System.out.println("Na Południu - Żółty;");
        System.out.println("Na Wschodzie - Czerwony;");
        System.out.println("Patrząc na te kolory masz flashbacki z instalacji Windowsa XD, którego pobrałeś u kolegi miesiąc temu");
        System.out.println("Kliknij enter by kontynuować");
        String Dalej = scan.nextLine();
        System.out.println("Myślisz w którą stronę pójść...");
        System.out.println("Wpisz nazwę koloru bez polskich znaków by pójść w jego kierunku");

        String kolor = scan.nextLine();
        if(kolor.equals("Zielony")) {
            Postaci jungle = new Postaci();
            jungle.setImie("Rysiek");
            jungle.setNazwisko("Dziki");
            jungle.setKlasa("Goblin");
            jungle.setRola("Przewodnik");
            jungle.setWiek(35);
            System.out.println("Udałeś się na północ, a przynajmniej tak Ci się wydaje");
            System.out.println("---");
            System.out.println("Idąc w tym kierunku słyszysz dźwięki podobne do jakichś bongosów czy innego instrumentu w który się puka");
            System.out.println("Ale co tam, idziesz tam! Przecież jesteś nieustraszonym " + bohater.getKlasa() + "em!");
            System.out.println("Kliknij enter by kontynuować");
            String Dalej1 = scan.nextLine();
            System.out.println("Zadziałało! Jesteś w...dżungli?");
            System.out.println("Podchodzi do Ciebie dziwnie wyglądający, pomalowany tubylec.");
            System.out.println((char)27+"[01;92m    Kim Ty być?"+(char)27+"[00;00m");
            System.out.println("Zastanawiasz się nad dwoma rzeczami");
            System.out.println("Po pierwsze - Co odpowiedzieć;");
            System.out.println("Po drugie - Jakim cudem w dźungli ktoś rozumie język polski, bo przecież w Polsce jak w lesie");
            System.out.println("Co odpowiesz?");
            System.out.println((char)27+"[01;95m   A) Jestem " + bohater.getImie() + " " + bohater.getNazwisko() + " a Ty?"+(char)27+"[00;00m");
            System.out.println((char)27+"[01;95m   B) Jakim cudem mnie rozumiesz?!?"+(char)27+"[00;00m");
            System.out.println("Wybierz poprzez wpisanie A lub B");
            String Wybor1 = scan.nextLine();
            if(Wybor1.equals("A"))
            {
                System.out.println((char)27+"[01;92m    Witaj, jestem " + jungle.getNazwisko() + " " + jungle.getImie() + ". "+(char)27+"[00;00m");
                        System.out.println((char)27+"[01;92m    Jestem " + jungle.getKlasa() + "em i mam " + jungle.getWiek() + " lat."+(char)27+"[00;00m");
                        System.out.println((char)27+"[01;92m    Mieszkam w tej jungli i zawsze miło witam przybyszy"+(char)27+"[00;00m");
            }
            else{

                System.out.println("Oh no tak, wszyscy uważają, że w Polsce jak w lesie, bo ludzie tu mieszkający was rozumieją, to oczywiste.");
                System.out.println("Witaj, jestem" + jungle.getNazwisko() + " " + jungle.getImie() + ". ");
                System.out.println("Jestem " + jungle.getKlasa() + "em i mam " + jungle.getWiek() + " lat.");

            }

        }
        else{
            if(kolor.equals("Niebieski")){
                System.out.println("Udałeś się na Zachód, a przynajmniej tak myślisz");
                System.out.println("---");
                }
            else {
                if (kolor.equals("Zolty")) {
                    System.out.println("Widzisz przed sobą Żółty kolor do którego się kierujesz");
                    System.out.println("---");
                } else {
                if (kolor.equals("Czerwony")) {
                    System.out.println("Idziesz spokojnym krokiem na Południe do koloru czerwonego, jest Ci coraz cieplej");
                    System.out.println("---");
                }
                else {
                    System.out.println("Nie podałeś właściwego koloru!");
                    System.out.println("---");

                }
            }
            }
            }

        }

    }


