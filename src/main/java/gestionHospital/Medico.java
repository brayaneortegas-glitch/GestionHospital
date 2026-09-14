package gestionHospital;

import java.util.ArrayList;

public class Medico extends Persona {
    private String especialidad;
    private String numeroRegistro;
    private ArrayList<Paciente> pacientes;

    public Medico(String nombre, String dni, int edad, String genero,
                  String especialidad, String numeroRegistro) {

        super(nombre, dni, edad, genero);

        this.especialidad = especialidad;
        this.numeroRegistro = numeroRegistro;
        this.pacientes = new ArrayList<>();
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el Dr. " + getNombre());
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void revisarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente.getNombre());
        }
    }

    public int asignarPrioridad(String sintoma) {

        switch (sintoma) {
            case "Infarto":
                return 1;

            case "Fiebre":
                return 2;

            case "Dolor":
                return 3;

            default:
                return 0;
        }
    }

    public void evaluarSintoma(String sintoma) {

        int prioridad = asignarPrioridad(sintoma);

        System.out.println(
                "El Dr. " + getNombre()
                        + " evaluó el síntoma " + sintoma
                        + " y asignó Prioridad " + prioridad
        );
    }

}
