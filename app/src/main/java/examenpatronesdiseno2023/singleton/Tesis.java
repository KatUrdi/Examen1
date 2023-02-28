package examenpatronesdiseno2023.singleton;
public class Tesis {

    private String mencion;
    private String titulo;
    private Estudiante estudianteData;

    public Tesis (){}

    public String getMencion(){
        return mencion;
    }

    public void setMencion(String mencion){
        this.mencion= mencion;
    }

     public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Estudiante getEstudianteData(){
        return estudianteData;
    }

    public void setEstudianteData(Estudiante estudianteData){
        this.estudianteData = estudianteData;
    }

    
}
