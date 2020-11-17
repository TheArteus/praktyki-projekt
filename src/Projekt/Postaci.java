package Projekt;

public class Postaci {

    protected String imie;
    protected String nazwisko;
    protected String klasa;
    protected String rola;
    protected int wiek;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getKlasa() {
        return klasa;
    }

    public String getRola() {
        return rola;
    }

    public int getWiek() {
        return wiek;
    }
}
