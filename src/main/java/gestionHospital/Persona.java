package gestionHospital;

public abstract class Persona {
    private String nombre;
    private String dni;
    private int edad;
    private String genero;

    public Persona(String nombre, String dni, int edad, String genero) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.genero = genero;
    }

    public abstract void presentarse();

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
}
