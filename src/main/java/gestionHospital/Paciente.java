package gestionHospital;

public class Paciente extends Persona {
    
    private String numeroHistorial;
    private String eps;
    private double saldoDisponible;
    private String sintomas;

    public Paciente(String nombre, String dni, int edad, String genero,
                    String numeroHistorial, String eps,
                    double saldoDisponible, String sintomas) {

        super(nombre, dni, edad, genero);

        this.numeroHistorial = numeroHistorial;
        this.eps = eps;
        this.saldoDisponible = saldoDisponible;
        this.sintomas = sintomas;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el paciente " + getNombre());
    }

    public void mostrarSintomas() {
        System.out.println("Síntomas: " + sintomas);
    }

    public void pagarConsulta() {

        double costoConsulta = 50.0;

        if (saldoDisponible >= costoConsulta) {

            saldoDisponible = saldoDisponible - costoConsulta;

            System.out.println(
                    "El paciente " + getNombre()
                            + " intenta pagar $" + costoConsulta
                            + " Saldo actual $" + (saldoDisponible + costoConsulta)
                            + " Resultado Éxito"
            );

        } else {

            System.out.println(
                    "El paciente " + getNombre()
                            + " intenta pagar $" + costoConsulta
                            + " Saldo actual $" + saldoDisponible
                            + " Resultado Rechazado"
            );
        }
    }

    public String getEps() {
        return eps;
    }
}
