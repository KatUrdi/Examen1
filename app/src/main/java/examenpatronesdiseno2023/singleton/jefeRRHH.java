package examenpatronesdiseno2023.singleton;
import java.util.Date;

public class jefeRRHH {
    
    private String nombre;
    private String CI;

    public jefeRRHH(){}

    public String getNombre(){
        return nombre
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCi(){
        return CI
    }

    public void setNombre(String CI){
        this.CI = CI;
    }

    public void registroTesis(Tesis tesis, Date date) {

        bddesis.getInstance().registroTesis(tesis, date);

    }

    public void mostrarDatosRegistro() {

        bddTesis.getInstance().mostrarRegistro();

    }
}


