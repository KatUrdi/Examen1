package examenpatronesdiseno2023.builder;
public class ContratoBuilder {
    protected Contrato contrato;

    public Contrato getContrato() {

        return contrato;

    }

    public void createContrato() {

        contrato = new Contrato();

    }

    public abstract void buildCosto();

    public abstract void buildEmpresa();

    public abstract void buildCanales();


}
