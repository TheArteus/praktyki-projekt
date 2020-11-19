package Projekt;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Human bohater = new Human();


        Scanner scan = new Scanner(System.in);

        System.out.println("Crown Of The Unknown");
        System.out.println("--------");
        System.out.println("Witaj w tej krótkiej grze tekstowej, która ma za zadanie pokazać Ci, że jedyną granicą jaką mamy jest wyobraźnia.");
        System.out.println("Świat opisany w tym tytule jest wzorowany na Abstraktonie napisanym przez Staszka iGRAszkowskiego");
        System.out.println("W grze znajdują się liczne nawiązania do twórczości YouTubera - Elevena oraz sucharów czy lam Staszka");
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
           int a;

                if (kolor.equals("Zielony")) {
                    a = 1;
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
                    System.out.println((char) 27 + "[01;32m---------------------------------" + (char) 27 + "[00;00m");
                    System.out.println("Zadziałało! Jesteś w..." +  + (char) 27 + "[00;32mdżungli" + (char) 27 + "[00;00m" + "?");
                    System.out.println("Na ziemi widzisz żółte kwiatki, wyglądają jakby się do Ciebie uśmiechały");
                    System.out.println("Po swoich przeżyciach stwierdzasz, że zdepczesz te nędzne kreatury");
                    System.out.println("Tym razem nie będzie lekko, " + (char) 27 + "[01;31mGenoside dziwki!" + (char) 27 + "[00;00m");
                    String Dalej2 = scan.nextLine();
                    System.out.println("Podchodzi do Ciebie dziwnie wyglądający, pomalowany tubylec.");
                    System.out.println((char) 27 + "[01;92m    Kim Ty być?" + (char) 27 + "[00;00m");
                    System.out.println("Zastanawiasz się nad dwoma rzeczami");
                    System.out.println("Po pierwsze - Co odpowiedzieć;");
                    System.out.println("Po drugie - Jakim cudem w dźungli ktoś rozumie język polski, bo przecież w Polsce jak w lesie");
                    System.out.println("Co odpowiesz?");
                    System.out.println((char) 27 + "[01;95m   A) Jestem " + bohater.getImie() + " " + bohater.getNazwisko() + " a Ty?" + (char) 27 + "[00;00m");
                    System.out.println((char) 27 + "[01;95m   B) Jakim cudem mnie rozumiesz?!?" + (char) 27 + "[00;00m");
                    System.out.println("Wybierz poprzez wpisanie A lub B");
                    String Wybor1 = scan.nextLine();

                    if (Wybor1.equals("A")) {
                        System.out.println((char) 27 + "[01;92m    Witaj, jestem " + jungle.getNazwisko() + " " + jungle.getImie() + ". " + (char) 27 + "[00;00m");
                        System.out.println((char) 27 + "[01;92m    Jestem " + jungle.getKlasa() + "em i mam " + jungle.getWiek() + " lat." + (char) 27 + "[00;00m");
                        System.out.println((char) 27 + "[01;92m    Mieszkam w tej jungli i zawsze miło witam przybyszy" + (char) 27 + "[00;00m");
                    } else {

                        System.out.println((char) 27 + "[01;92m    Oh no tak, wszyscy uważają, że w Polsce jak w lesie, bo ludzie tu mieszkający was rozumieją, to oczywiste.");
                        System.out.println((char) 27 + "[01;92m    Witaj, jestem" + jungle.getNazwisko() + " " + jungle.getImie() + ". ");
                        System.out.println((char) 27 + "[01;92m    Jestem " + jungle.getKlasa() + "em i mam " + jungle.getWiek() + " lat.");

                    }
                    System.out.println((char) 27 + "[01;92m    Jak się domyślam nie jesteś tu z własnej woli, prawda?" + (char) 27 + "[00;00m");
                    System.out.println("Stoisz przed tubylcem zdziwiony tym co właśnie Ci powiedział.");
                    System.out.println((char) 27 + "[01;95m   No cóż...masz rację" + (char) 27 + "[00;00m");
                    System.out.println((char) 27 + "[01;92m    Zapewne chciałbyś się stąd wydostać, prawda?" + (char) 27 + "[00;00m");
                    String Dalej3 = scan.nextLine();
                    System.out.println((char) 27 + "[01;95m   Zgadza się, ale na ślepo nie dam rady, pomożesz mi jakoś?" + (char) 27 + "[00;00m");
                    System.out.println((char) 27 + "[01;92m    No cóż, musisz przejść przez ten lasek" + (char) 27 + "[00;00m");
                    System.out.println((char) 27 + "[01;92m    Więcej Ci nie mogę podpowiedzieć" + (char) 27 + "[00;00m");
                    System.out.println((char) 27 + "[01;95m   A) To tyle? Żadnych drzwi wyjściowych, gwiezdnych wrót?" + (char) 27 + "[00;00m");
                    System.out.println((char) 27 + "[01;95m   B) Dziękuję, że pomogłeś mi choć tyle." + (char) 27 + "[00;00m");
                    String Wybor2 = scan.nextLine();
                    if (Wybor2.equals("A")) {
                        System.out.println((char) 27 + "[01;92m    Czy Ty myślisz, że to jest jakaś gra lub serial?" + (char) 27 + "[00;00m");
                        System.out.println((char) 27 + "[01;92m    To nie jest Jumanji, Panie Kolego!" + (char) 27 + "[00;00m");
                        System.out.println((char) 27 + "[01;92m       Swoją drogą wyglądasz dość smakowicie, a skoro mnie obrażasz to czemu nie miałbym Cię zjeść..." + (char) 27 + "[00;00m");
                        Punkty ending_jg2 = new Punkty();

                        ending_jg2.deathinfo("Kawał Mięcha", "I widzisz czemu mama mówiła byś był miły dla obcych?", 2);
                    } else {
                        System.out.println((char) 27 + "[01;92m    Nie ma za co, przynajmniej jesteś wdzięczny za to co robię!" + (char) 27 + "[00;00m");
                    }
                    System.out.println("Odchodzisz od tubylca, przynajmniej wiesz gdzie jesteś i co musisz zrobić...mniej więcej");
                    System.out.println("No cóż pora iść dalej, trzeba się stąd wydostać, nie chcę mieszkać na wyspie jak pewnych dwóch dzikusów");
                    System.out.println((char) 27 + "[01;32mKONIEC AKTU PIERWSZEGO" + (char) 27 + "[00;00m");
                    Punkty ending_jg1 = new Punkty();

                    ending_jg1.endinfo("Ucieczka z Dżungli", "Udało Ci się uciec z dżungli przy pomocy tubrylca", 1);


                } else {


                    if (kolor.equals("Niebieski")) {
                            a = 1;

                        System.out.println("Udałeś się na Zachód, a przynajmniej tak myślisz");
                        System.out.println("---");
                        System.out.println("Nagle czujesz niewyobrażalny chłód, jakby przyłożono Ci serce pewnej "+ (char) 27 + "[01;34mKozy" + (char) 27 + "[00;00m");
                        System.out.println("Ale chciałeś przecież lekko, skąd więc "+ (char) 27 + "[01;34mten ból" + (char) 27 + "[00;00m" + "?");
                        String Dalej3 = scan.nextLine();
                        System.out.println("Widzisz wieszak , a na nim kurtkę zimową, wręcz ubiór na ekspedycję na biegun");
                        System.out.println((char) 27 + "[01;95m   Bardzo fajnie, ż-że ktoś z-z-z-ostawił mi tu k-kurteczkę" + (char) 27 + "[00;00m");
                        System.out.println("Czy chcesz wziąć kurtkę? (Tak/Nie)");
                        String yesno = scan.nextLine();
                        if (yesno.equals("Tak")) {
                            System.out.println("Wziąłeś kurtkę, idziesz więc dalej, jest Ci o wiele cieplej");
                            System.out.println("Wychodzisz nagle na powietrze, widzisz przed sobą góry");
                            System.out.println((char) 27 + "[01;95m   Jak tu cholernie zimno! Hmm...trzy ścieżki" + (char) 27 + "[00;00m");
                            System.out.println("Widzisz trzy ścieżki, gdzie pójdziesz? (Prosto, Lewo, Prawo)");
                            String sciezka = scan.nextLine();
                            if (sciezka.equals("Prosto")) {
                                System.out.println("Poszedłeś prosto, idziesz między górami");
                                System.out.println("Przed sobą widzisz chatkę, z komina leci dym");
                                System.out.println("Czy chcesz iść do tej chatki?");
                                String yesno1 = scan.nextLine();
                            } else {
                                if (sciezka.equals("Lewo")) {
                                    System.out.println("Udałeś się w lewo, wchodzisz do doliny");
                                    System.out.println("Przed sobą widzisz jakąś walkę, nie jest to jakieś 1 vs 1 a bardziej bitwa wojk, niczym w Hobbicie");
                                    System.out.println((char) 27 + "[01;95m   Hold Up..." + (char) 27 + "[00;00m");
                                    String dalejpiach = scan.nextLine();
                                    System.out.println((char) 27 + "[01;95m   O CHUJ TAM LATA SMOK" + (char) 27 + "[00;00m");
                                    System.out.println("Tak. Jesteś w trakcie bitwy w Hobbicie.");
                                    System.out.println("Co zrobisz? Zawołasz Gandalfa? Dołączysz do walki czy spróbujesz uciec?");
                                    System.out.println("(Gandalf, Walcz, Uciekaj)");
                                    String erewor = scan.nextLine();
                                    switch (erewor) {
                                        case "Gandalf":
                                            System.out.println((char) 27 + "[01;95m   GANDALF HALO POMÓŻ MI CHCĘ SIĘ STĄD WYDOSTAĆ" + (char) 27 + "[00;00m");
                                            System.out.println("Co dziwne, widzisz nagle wynurzający się z tej walki biały strój");
                                            System.out.println((char) 27 + "[01;95m   NO BEZ TAKICH...GANDALF?!?" + (char) 27 + "[00;00m");
                                            System.out.println((char) 27 + "[01;37m   Cz-Człowiek?!?..." + (char) 27 + "[00;00m");
                                            System.out.println((char) 27 + "[01;37m   Oh, a więc co chcesz i jak się tu właściwie znalazłeś? Sauron Cię tu sprowadził?" + (char) 27 + "[00;00m");
                                            System.out.println((char) 27 + "[01;95m   A) No więc jestem " + bohater.getImie()+ " " + bohater.getNazwisko() + (char) 27 + "[00;00m");
                                            System.out.println((char) 27 + "[01;95m   B) Umm...no więc chciałbym się stąd wydostać, nie wiem co tu robię" + (char) 27 + "[00;00m");
                                            System.out.println("(A/B)");
                                            String gandolf = scan.nextLine();
                                            if(gandolf.equals("A")){
                                                System.out.println((char) 27 + "[01;95m   No więc tak, już wiesz kim jestem. I nie, nie wysłał mnie tu Sauron...chyba" + (char) 27 + "[00;00m");
                                                System.out.println((char) 27 + "[01;37m   " + (char) 27 + "[00;00m");
                                            }
                                            else{
                                                System.out.println("Gandalf chwilę stoi i myśli");
                                            }
                                            break;
                                        case "Walcz":
                                            System.out.println("Wbijasz się w walkę, nie wiesz z kim walczysz, przeciwko komu.");
                                            System.out.println("Nieważne, że nie masz broni ani tarczy wchodzisz tam");
                                            System.out.println("Po kiilku chwilach okładania orków z tarczą giniesz.");
                                            System.out.println("");
                                            Punkty ending_snow1 = new Punkty();

                                            ending_snow1.deathinfo("Warzywny Magnes", "Wow! Naprawdę myślałeś, że rzucając się do walki na ślepo coś zdziałasz?", 4);
                                            break;
                                        case "Uciekaj":
                                            System.out.println("Próbujesz uciec, lecz krasnoludy zauważając to strzelają do Ciebie, myśląc ,że jesteś zdrajcą");
                                            Punkty ending_snow2 = new Punkty();

                                            ending_snow2.deathinfo("The Escapist!", (char) 27 + "[01;31mOh więc to nie był zdrajca? No cóż, trudno"+ (char) 27 + "[00;00m", 5);
                                            break;
                                    }
                                } else {
                                    System.out.println("Pomyślałeś, że najlepiej będzie pójść w prawo, śnieg na tej ścieżce staje się coraz mniej gęsty");


                                }
                            }
                        } else {
                            System.out.println("Zostawiasz kurtkę, jako gruboskórny " + bohater.getKlasa() + " wytrzymasz!");
                            System.out.println("Idziesz więc dalej trzęsąc się z zimna...");
                            String Dalej4 = scan.nextLine();
                            System.out.println("Po kilku krokach Twoje ciało nie wytrzymuje, zamarzasz");
                            System.out.println("Naprawdę myślałeś, że w takim zimnie wytrzymasz?" + (char) 27 + "[01;31mYou fool" + (char) 27 + "[00;00m");
                            Punkty ending_snow1 = new Punkty();

                            ending_snow1.deathinfo("Kozaczek...Tylko Że Sandał", "Wow! Zapewne myślałeś, że spod kurtki coś co Cię zabije, a tu proszę! W drugą stronę!", 3);
                        }

                    } else {
                        if (kolor.equals("Zolty")) {
                            a = 1;
                            System.out.println("Widzisz przed sobą Żółty kolor do którego się kierujesz");
                            System.out.println("---");
                            System.out.println("Czujesz ciepły wiatr, jakbyś otworzył nagrzany piekanik.");
                            System.out.println("Ale przecież go wyłączałeś, prawda? PRAWDA?");
                            String Dalej3 = scan.nextLine();
                            System.out.println("Idąc dalej czujesz, że coś Ci wlatuje do ust");
                            System.out.println((char) 27 + "[01;95m   Mam nadzieję, że to nie jakieś żyrandole stłuczone, wystarczy jeden rozwalony" + (char) 27 + "[00;00m");
                            System.out.println((char) 27 + "[01;95m   Huh, przynajmniej wiesz, że się nie zakrztusisz ze śmiechu" + (char) 27 + "[00;00m");
                            System.out.println("Jesteś na pustyni, czyli to jednak nie był żyrandol, całe szczęście");
                            System.out.println("Stoisz na środku pustyni, ubrany w stary T-Shirt i jeansy. Jest Ci bardzo gorąco");
                            System.out.println("Widzisz oazę, dziurę oraz...górę piasku");
                            System.out.println("Dokąd chcesz iść? (Oaza, Dziura, Piasek");
                            String piasek1 = scan.nextLine();
                            switch (piasek1) {
                                case "Oaza":
                                    System.out.println("Udałeś się w kierunku oazy, bo jesteś bardzo spragniony.");
                                    break;

                                case "Dziura":
                                    System.out.println("Uznałeś, że dobrym pomysłem będzie pójść w kierunku dziury. Wydaje Ci się, że będzie tam zimniej");
                                    System.out.println("I rzeczywiście jest! Siadasz by odpocząć w tej dziurze, dopóki masz możliwość to trzeba z niej skorzystać");

                                    break;

                                default:
                                    System.out.println("Nigdzie nie poszedłeś i niestety dostałeś udaru po pewnym czasie czekając na ratunek, BRAWO!");

                            }
                        } else {
                            if (kolor.equals("Czerwony")) {
                                a = 1;
                                System.out.println("Idziesz spokojnym krokiem na Południe do koloru czerwonego, jest Ci coraz cieplej");
                                System.out.println("---");
                            } else {
                                a = 5;
                                System.out.println("Nie podałeś właściwego koloru!");
                                System.out.println("---");
                                System.out.println("");

                            }
                        }
                    }
                }



        }



    }