package examenpatronesdiseno2023.singleton;
import java.util.Date;

public class Client {
    public static void main(String[] args)  {

        JefeRRHH jefeRRHH  = new JefeRRHH();

        jefeRRHH.setCi("1111PT");
        jefeRRHH.setNombre("Katzumi");

        Tesis tema1 = new Tesis();
        Tesis tema2 = new Tesis();
        Tesis tema3 = new Tesis();
        Tesis tema4 = new Tesis();

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();

        estudiante1.setCi("569847PT");
        estudiante2.setCi("6599654CBBA");
        estudiante3.setCi("6985545LP");
        estudiante4.setCi("66955485CH");
        estudiante1.setNombre("Fabiola");
        estudiante2.setNombre("Andres");
        estudiante3.setNombre("Camila");
        estudiante4.setNombre("Fujiko");



        tema1.setTitulo("Agronomia");
        tema1.setMencion("Plantas");
        tema1.setDatosEstudiante(estudiante1);

        tema2.setTitulo("Diseño grafico");
        tema2.setMencion("Portadas");
        tema2.setDatosEstudiante(estudiante2);


        tema3.setTitulo("Marketing");
        tema3.setMencion("Redes sociales");
        tema3.setDatosEstudiante(estudiante3);

        tema4.setTitulo("Arquitectura");
        tema4.setMencion("Diseño de interiores");
        tema4.setDatosEstudiante(estudiante4);




        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRRHH.registroTesis(tema1, new Date());
                jefeRRHH.mostrarDatosRegistro();


            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {


                jefeRRHH.registroTesis(tema2, new Date());
                jefeRRHH.mostrarDatosRegistro();

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRRHH.registroTesis(tema3, new Date());
                jefeRRHH.mostrarDatosRegistro();

            }
        });


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRRHH.registroTesis(tema4, new Date());
                jefeRRHH.mostrarDatosRegistro();

            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRRHH.registroTesis(tema1, new Date());
                jefeRRHH.mostrarDatosRegistro();

            }
        });


        thread1.start();

        thread2.start();

        thread3.start();

        thread4.start();

        thread5.start();

    }
}
