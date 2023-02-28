package examenpatronesdiseno2023.factoryMethod;
public class PelotaFutbol implements IElemento {

    private String tamanio;
    private String color;
    private String garantia;

    public PelotaFutbol() {}

    public String getTamano() {
        return tamano;
    }

    public void setTamanio(String tamano) {
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

        System.out.println("PelotaFutbol: ");
        System.out.println("Tamano: " + getTamanio());
        System.out.println("Color: " + getColor());
        System.out.println("Garantia " + getGarantia());


    }
}
