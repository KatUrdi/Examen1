package examenpatronesdiseno2023.builder;
public class ContratoNETFLIX extends ContratoBuilder {
    @Override
    public void buildCosto() {

        contrato.setCosto(150);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("netflix");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("10 cosas que odio de ti");
        canales.add("la sirenita");
        canales.add("la dama de negro");

        contrato.setCanalesList(canales);

    }
}

