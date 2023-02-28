import java.util.ArrayList;
import java.util.List;
public class ContratoAMAZON extends ContratoBuilder{
    @Override
    public void buildCosto() {

        contrato.setCosto(50);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("AWS");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("El principito");
        canales.add("blancanieves");
        canales.add("The Avengers");

        contrato.setCanalesList(canales);

    }
}

