import java.util.List;
public class Contrato {
    private int costo;
    private String empresa;
    private List<String>canalesList;

    public Contrato() {}

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public List<String> getCanalesList() {
        return canalesList;
    }

    public void setCanalesList(List<String> canalesList) {
        this.canalesList= canalesList;
    }

    public void showInfo() {

        System.out.println("Contrato: ");
        System.out.println("Costo: " + getCosto());
        System.out.println("Empresa: " + getEmpresa());

        for(int i = 0; i<canalesList.size(); i++) {

            System.out.println("Canal " + (i+1) + ": " + canalesList.get(i));

        }


    }

    
}
