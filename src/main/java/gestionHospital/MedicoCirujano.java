package gestionHospital;

public class MedicoCirujano extends Medico implements ICirujano {
    private int numeroQuirofano;

    public MedicoCirujano(String nombre, String dni, int edad, String genero,
                          String especialidad, String numeroRegistro,
                          int numeroQuirofano) {

        super(nombre, dni, edad, genero, especialidad, numeroRegistro);

        this.numeroQuirofano = numeroQuirofano;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el Dr. " + getNombre() + ", cirujano.");
    }

    @Override
    public void realizarOperacion(boolean quirofanoDisponible) {

        if (quirofanoDisponible) {
            System.out.println("El Dr. " + getNombre()
                    + " realizó la operación en el quirófano "
                    + numeroQuirofano);
        } else {
            System.out.println("El Dr. " + getNombre()
                    + " no pudo realizar la operación porque el quirófano "
                    + "no está disponible.");
        }
    }
}
