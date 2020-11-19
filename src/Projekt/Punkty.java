package Projekt;

public class Punkty {

    protected String Nazwa;
    protected String Opis;
    protected int nr_ending;
    protected int ilosc;

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public void setNr_ending(int nr_ending) {
        this.nr_ending = nr_ending;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public String getOpis() {
        return Opis;
    }

    public int getNr_ending() {
        return nr_ending;
    }

    public int getIlosc() {
        return ilosc;
    }

    public Punkty(String nazwa, String opis, int nr_ending, int ilosc) {
        this.Nazwa = nazwa;
        this.Opis = opis;
        this.nr_ending = nr_ending;
        this.ilosc = ilosc;
    }

    public Punkty() {
    }

    public void endinfo(String Nazwa, String Opis, int nr_ending)
    {
        this.Nazwa = Nazwa;
        this.Opis = Opis;
        this.nr_ending = nr_ending;
        System.out.println((char) 27 + "[01;36m                     Zdobyłeś zakończenie - Ucieczka!" + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;32m         " + Nazwa + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;32m         " + Opis + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;32m         Ending Numer: " + nr_ending + (char) 27 + "[00;00m");
    }

    public void deathinfo(String Nazwa, String Opis, int nr_ending)
    {
        this.Nazwa = Nazwa;
        this.Opis = Opis;
        this.nr_ending = nr_ending;
        System.out.println((char) 27 + "[01;36m                     Zdobyłeś zakończenie - Uśmiercenie!" + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;31m         " + Nazwa + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;31m         " + Opis + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;31m         Ending Numer: " + nr_ending + (char) 27 + "[00;00m");
    }

}
