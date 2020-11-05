package Zadania;

public class main {
    public static void main(String[] args) {
            Uczen Artur = new Uczen();

        Artur.setimie("Artur");
        Artur.setnazwisko("Pinkiewicz");
        Artur.setwiek(18);

            System.out.println(Artur.getimie() + " "+ Artur.getnazwisko() + " lat " + Artur.getwiek());

    }
}
