package gestionHospital;

import java.util.ArrayList;

public class gestionHospital {

    public static void main(String[] args) {

        // =========================
        // MÉDICOS
        // =========================

        Medico medico1 = new Medico("Carlos", "1001", 45, "M",
                "Cardiología", "RM001");

        Medico medico2 = new Medico("Laura", "1002", 39, "F",
                "Pediatría", "RM002");

        Medico medico3 = new Medico("Andrés", "1003", 50, "M",
                "Neurología", "RM003");

        Medico medico4 = new Medico("Valentina", "1004", 34, "F",
                "Dermatología", "RM004");


        // =========================
        // CIRUJANOS
        // =========================

        MedicoCirujano cirujano1 = new MedicoCirujano(
                "Pedro", "2001", 48, "M",
                "Cirugía General", "RC001", 1);

        MedicoCirujano cirujano2 = new MedicoCirujano(
                "Sofía", "2002", 41, "F",
                "Cirugía Cardiovascular", "RC002", 2);

        MedicoCirujano cirujano3 = new MedicoCirujano(
                "Miguel", "2003", 52, "M",
                "Traumatología", "RC003", 3);

        MedicoCirujano cirujano4 = new MedicoCirujano(
                "Daniela", "2004", 37, "F",
                "Neurocirugía", "RC004", 4);


        // =========================
        // PACIENTES
        // =========================

        Paciente paciente1 = new Paciente(
                "Juan", "3001", 25, "M",
                "H001", "Sura", 100.0, "Fiebre");

        Paciente paciente2 = new Paciente(
                "Ana", "3002", 31, "F",
                "H002", "Sanitas", 30.0, "Dolor");

        Paciente paciente3 = new Paciente(
                "Luis", "3003", 60, "M",
                "H003", "Nueva EPS", 80.0, "Infarto");

        Paciente paciente4 = new Paciente(
                "Camila", "3004", 22, "F",
                "H004", "Sura", 45.0, "Dolor");

        Paciente paciente5 = new Paciente(
                "Diego", "3005", 47, "M",
                "H005", "Sanitas", 150.0, "Fiebre");

        Paciente paciente6 = new Paciente(
                "Sara", "3006", 28, "F",
                "H006", "Nueva EPS", 20.0, "Dolor");

        Paciente paciente7 = new Paciente(
                "Mateo", "3007", 55, "M",
                "H007", "Sura", 70.0, "Infarto");

        Paciente paciente8 = new Paciente(
                "Valeria", "3008", 36, "F",
                "H008", "Sanitas", 55.0, "Fiebre");

        Paciente paciente9 = new Paciente(
                "Jorge", "3009", 43, "M",
                "H009", "Nueva EPS", 90.0, "Dolor");

        Paciente paciente10 = new Paciente(
                "Natalia", "3010", 19, "F",
                "H010", "Sura", 10.0, "Fiebre");

        Paciente paciente11 = new Paciente(
                "Felipe", "3011", 67, "M",
                "H011", "Sanitas", 200.0, "Infarto");

        Paciente paciente12 = new Paciente(
                "Mariana", "3012", 29, "F",
                "H012", "Nueva EPS", 40.0, "Dolor");


        // =========================
        // ASIGNAR PACIENTES
        // =========================

        medico1.agregarPaciente(paciente1);
        medico1.agregarPaciente(paciente2);
        medico1.agregarPaciente(paciente3);

        medico2.agregarPaciente(paciente4);
        medico2.agregarPaciente(paciente5);
        medico2.agregarPaciente(paciente6);


        // =========================
        // LISTA POLIMÓRFICA
        // =========================

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(medico1);
        personas.add(medico2);
        personas.add(medico3);
        personas.add(medico4);

        personas.add(cirujano1);
        personas.add(cirujano2);
        personas.add(cirujano3);
        personas.add(cirujano4);

        personas.add(paciente1);
        personas.add(paciente2);
        personas.add(paciente3);
        personas.add(paciente4);
        personas.add(paciente5);
        personas.add(paciente6);
        personas.add(paciente7);
        personas.add(paciente8);
        personas.add(paciente9);
        personas.add(paciente10);
        personas.add(paciente11);
        personas.add(paciente12);


        // =========================
        // POLIMORFISMO
        // =========================

        for (Persona persona : personas) {
            persona.presentarse();
        }


        // =========================
        // MÉDICOS
        // =========================

        medico1.revisarPacientes();
        medico2.revisarPacientes();

        medico1.evaluarSintoma("Infarto");


        // =========================
        // PACIENTES
        // =========================

        paciente1.mostrarSintomas();
        paciente1.pagarConsulta();

        paciente2.mostrarSintomas();
        paciente2.pagarConsulta();


        // =========================
        // CIRUJANOS
        // =========================

        cirujano1.realizarOperacion(true);
        cirujano2.realizarOperacion(false);


        // =========================
        // ATENCIÓN
        // =========================

        Atencion atencion = new Atencion();

        atencion.procesarIngreso(paciente1);
        atencion.procesarIngreso(paciente2);
        atencion.procesarIngreso(paciente3);
    }
}
