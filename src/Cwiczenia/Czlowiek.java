package Cwiczenia;

public class Czlowiek implements Czlowiekinterface{
    protected double wzrost;
    protected char plec; // m = mezczyzna // k = kobieta // c = cos innego
    protected double stopa;
    protected boolean lysy;
    protected String color_wlosow;
    protected int wiek;
    protected Czlowiek[] rodzice;

    public void work(String where, int zaile){

        System.out.println("Pracuje w" + where + "i zarabia" + zaile);

    }

    @Override
    public void learn(String czego) {

    }

    @Override
    public void run() {

    }

    @Override
    public Czlowiek give_birth() {
        return null;
    }

    @Override
    public void eat() {

    }

    @Override
    public void choruje() {

    }



    void setColor_wlosow(String color_wlosow){
      if(!lysy){
          this.color_wlosow = color_wlosow;
      }
      else{
          System.out.println("przeciez jest lysy, lol");
      }
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setStopa(double stopa) {
        this.stopa = stopa;
    }

    public void setLysy(boolean lysy) {
        this.lysy = lysy;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setRodzice(Czlowiek matka, Czlowiek ojciec) {
        rodzice = new Czlowiek[]{matka, ojciec};
    }

    public Czlowiek(double wzrost, char plec, double stopa, boolean lysy, String color_wlosow, int wiek, Czlowiek[] rodzice) {
        this.wzrost = wzrost;
        this.plec = plec;
        this.stopa = stopa;
        this.lysy = lysy;
        this.color_wlosow = color_wlosow;
        this.wiek = wiek;
        this.rodzice = rodzice;
    }

    public Czlowiek() {
    }




}

