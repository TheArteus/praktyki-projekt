package Projekt;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Human bohater = new Human();

        bohater.setImie("Corny");
        bohater.setNazwisko("Flakes");
        bohater.setSila(50);
        bohater.setPlec('m');
        Scanner scan = new Scanner(System.in);
        System.out.println("Początek");
        System.out.println("--------");
        System.out.println("Witaj w tej krótkiej grze tekstowej, która ma za zadanie pokazać Ci, że jedyną granicą jaką mamy jest wyobraźnia.");
        System.out.println("-----------------------------------------");
        System.out.println("Jak się nazywasz podróżniku?");
        String Nazwa = scan.nextLine();
        System.out.println("Twój bohater nazywa się: " + bohater.getImie() + " " + bohater.getNazwisko());
        System.out.println("-----------------------------------------");
        System.out.println("Budzisz się w ciemnym miejscu, widzisz światła w cztarech kolorach po różnych stronach:");
        System.out.println("Na Północy - Zielony;");
        System.out.println("Na Zachodzie - Niebieski;");
        System.out.println("Na Południu - Żółty;");
        System.out.println("Na Wschodzie - Czerwony;");
        System.out.println("Patrząc na te kolory masz flashbacki z instalacji Windowsa, którego pobrałeś u kolegi miesiąc temu");
        System.out.println("Myślisz w którą stronę pójść...");
        System.out.println("Wpisz nazwę koloru bez polskich znaków by pójśćw jego kierunku");

        String kolor = scan.nextLine();
        if(kolor.equals("Zielony")) {
            System.out.println("Udałeś się na północ, a przynajmniej tak Ci się wydaje");
            System.out.println("---");
        }
        else{
            if(kolor.equals("Niebieski")){
                System.out.println("Udałeś się na Zachód, a przynajmniej tak myślisz");
                System.out.println("---");
                }
            }
            if(kolor.equals("Zolty")){
                System.out.println("Widzisz przed sobą Żółty kolor do którego się kierujesz");
                System.out.println("---");
            }
            if(kolor.equals("Czerwony")){
                System.out.println("Idziesz spokojnym krokiem na Południe do koloru czerwonego, jest Ci coraz cieplej");
                System.out.println("---");
            }
        }

    }


