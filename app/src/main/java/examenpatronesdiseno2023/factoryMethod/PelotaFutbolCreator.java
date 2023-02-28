public class PelotaFutbolCreator extends PelotaFutbol {

    @Override
    public PelotaFutbol creator() {

        PelotaFutbol pelotaFutbol = new PelotaFutbol();

        pelotaFutbol.setTamanio("pequeña");
        pelotaFutbol.setColor("azul");
        pelotaFutbol.setGarantia("1 año");

        return  pelotaFutbol;

    }
}
