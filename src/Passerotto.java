public class Passerotto extends Animale implements IVolante {

    @Override
    public void verso() {
        System.out.println("Piiiiii");
    }

    @Override
    public void mangia() {
        System.out.println("Insetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}
