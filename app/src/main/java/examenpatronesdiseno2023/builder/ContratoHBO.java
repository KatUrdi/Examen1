package examenpatronesdiseno2023.builder;
import java.util.ArrayList;
import java.util.List;
public class ContratoHBO extends ContratoBuilder{
    @Override
    public void buildCosto() {

        contrato.setCosto(100);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("hbo");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("Harry Potter");
        canales.add("El titanic");
        canales.add("El padrino");

        contrato.setCanalesList(canales);

    }
}

