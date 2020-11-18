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
        Nazwa = nazwa;
        Opis = opis;
        this.nr_ending = nr_ending;
        this.ilosc = ilosc;
    }

    public Punkty() {
    }
}
