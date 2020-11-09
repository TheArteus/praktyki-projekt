package Cwiczenia;

public class Mechanik extends Czlowiek{

    protected int telefon;
    protected String ulica_zakladu;
    boolean czy_dobry = true;
    String[] zakres_pracy;

    public Mechanik(double wzrost, char plec, double stopa, boolean lysy, String color_wlosow, int wiek, Czlowiek[] rodzice, int telefon, String ulica_zakladu,String[] zakres_pracy){
    super(wzrost, plec, stopa, lysy, color_wlosow, wiek, rodzice);
    this.telefon = telefon;
    this.ulica_zakladu = ulica_zakladu;
    this.zakres_pracy = zakres_pracy;
    this.czy_dobry = czy_dobry;
    }
}
