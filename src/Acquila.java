public class Acquila extends Animale implements IVolante {

    @Override
    public void verso() {
        System.out.println("Squeeek");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
