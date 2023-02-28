package examenpatronesdiseno2023.factoryMethod;
public class ShortsCreator extends ElementoCreator {
    @Override
    public Shorts creator() {

        Shorts shorts = new Shorts();

        shorts.setTamanio("S");
        shorts.setColor("Morado");
        shorts.setGarantia("1 semana");

        return  shorts;

    }
}
