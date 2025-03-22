public class Main {
    
    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        
        Acquila aquila = new Acquila();
        Passerotto passerotto = new Passerotto();
        Delfino delfino = new Delfino();

       
        System.out.println("Animali che volano:");
        faiVolare(aquila);
        faiVolare(passerotto);

        
        System.out.println("\nAnimali che nuotano:");
        faiNuotare(delfino);
    }
}
