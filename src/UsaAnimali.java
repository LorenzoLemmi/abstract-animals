public class UsaAnimali {

    public static void main(String[] args) {
        
        Animale acquila = new Acquila();
        Animale passerotto = new Passerotto();
        Animale delfino = new Delfino();
        Animale cane = new Cane();

        acquila.dormi();
        acquila.verso();
        acquila.mangia();

        passerotto.verso();

        delfino.verso();

        cane.verso();
    }

}
