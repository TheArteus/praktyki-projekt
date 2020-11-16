package Projekt;

public class Human {


    protected String imie;
    protected String nazwisko;
    protected int sila;
    protected String klasa;
    protected char plec; // m = mezczyzna // k = kobieta // c = cos innego

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public void setPlec(char plec) {
        this.plec = plec;
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

    public int getSila() {
        return sila;
    }

    public char getPlec() {
        return plec;
    }


}
