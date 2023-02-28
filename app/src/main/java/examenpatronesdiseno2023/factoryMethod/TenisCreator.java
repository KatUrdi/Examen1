package examenpatronesdiseno2023.factoryMethod;
public class TenisCreator extends ElementoCreator {
    @Override
    public Tenis creator() {

        Tenis tenis = new Tenis();

        tenis.setTamano("36");
        tenis.setColor("negros");
        tenis.setGarantia("1 año");

        return  tenis;

    }
}
