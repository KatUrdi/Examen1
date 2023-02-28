package examenpatronesdiseno2023.factoryMethod;
public class MediasCreator  extends ElementoCreator{
    @Override
    public Medias creator() {

        Medias medias = new Medias();

        medias.setTamanio("M");
        medias.setColor("blancas");
        medias.setGarantia("nunca");

        return medias;

    }
}
