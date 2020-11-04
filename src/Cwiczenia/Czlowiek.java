package Cwiczenia;

public class Czlowiek {
    private double wzrost;
    private char plec; // m = mezczyzna // k = kobieta // c = cos innego
    private double stopa;
    private boolean lysy;
    private String color_wlosow;
    private int wiek;
    private Czlowiek[] rodzice;

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
}
