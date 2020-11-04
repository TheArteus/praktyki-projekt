package Cwiczenia;

public class main {

    public static void main(String[] args) {

        Czlowiek artur = new Czlowiek();
        Czlowiek marek = new Czlowiek();
        Czlowiek aleksandra = new Czlowiek();

        artur.setLysy(false);
        artur.setColor_wlosow("Brunet");
        artur.setPlec('m');
        artur.setWzrost(183);
        Czlowiek matka = new Czlowiek();
        Czlowiek ojciec = new Czlowiek();
        artur.setRodzice(matka, ojciec);

        marek.setColor_wlosow("Brunet");
        marek.setLysy(false);
        marek.setPlec('m');
        marek.setWzrost(184);


    }


}
