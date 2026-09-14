package gestionHospital;

public class Atencion {
    public void procesarIngreso(Paciente paciente) {

        String eps = paciente.getEps();

        switch (eps) {
            case "Sura":
                System.out.println("Paciente " + paciente.getNombre()
                        + " asignado al Pabellón A");
                break;

            case "Sanitas":
                System.out.println("Paciente " + paciente.getNombre()
                        + " asignado al Pabellón B");
                break;

            case "Nueva EPS":
                System.out.println("Paciente " + paciente.getNombre()
                        + " asignado al Pabellón C");
                break;

            default:
                System.out.println("Paciente " + paciente.getNombre()
                        + " asignado al Pabellón General");
        }
    }
}
