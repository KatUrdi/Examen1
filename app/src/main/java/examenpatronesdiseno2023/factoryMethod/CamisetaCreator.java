package examenpatronesdiseno2023.factoryMethod;
public class CamisetaCreator extends ElementoCreator{
    
    @Override
    public Camiseta creator() {

        Camiseta camiseta = new Camiseta();

        camiseta.setTamano("S");
        camiseta.setColor("Rosa");
        camiseta.setGarantia("6 meses");

        return  camiseta;

    }
}
