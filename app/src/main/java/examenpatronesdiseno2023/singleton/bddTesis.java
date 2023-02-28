import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class bddTesis {

    private static bddTesis instance;
    private Map<Tesis, Date> registro = new ConcurrentHashMap<>();

    private bddTesis(){

        System.out.println("--------------------");
        System.out.println("Creando Base de Datos De Tesis");
        System.out.println("--------------------");
    }

    public static bddTesis getInstance(){
        if (instance == null){
            multiThreadControl();
        }
        return instance;
    }

    private synchronized static void multiThreadControl(){
        if (instance == null){
            instance = new bddTesis();
        }
    }

    public synchronized void registroTesis(Tesis tesis, Date date){
        if(!registro.containsKey(tesis)){

            System.out.println("Se esta registrando la tesis del estudiante: " + tesis.getEstudianteData().getNombre() + "en la fecha: " + date);
            registro.put(tesis, date);
        }else{

            System.out.println("Error, La Tesis ya existe, no se puede duplicar");
        }

    
    }

    public synchronized void mostarRegistro(){
        System.out.println("--------Registro-------");
        for(Map.Entry<Tesis, Date> entry: registro.entrySet()){

            System.out.println(entry.getKey().getEstudianteData().getNombre() + "////" + entry.getKey().getEstudianteData().getCi()+ "/////" + entry.getKey().getTitulo() + "////" + entry.getKey().getMencion() + "//////" + entry.getValue())
        }
    }
    
}
