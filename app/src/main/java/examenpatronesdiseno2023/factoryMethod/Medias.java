package examenpatronesdiseno2023.factoryMethod;
public class Medias implements IElemento {
    
    private String tamano;
    private String color;
    private String garantia;

    public Medias() {}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }


    @Override
    public void showInfo() {

        System.out.println("Medias: ");
        System.out.println("Tamano: " + getTamano());
        System.out.println("Color: " + getColor());
        System.out.println("Garantia " + getGarantia());

    }

}
