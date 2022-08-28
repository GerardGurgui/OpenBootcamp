package maps;

public class Persona {

    private String nom;
    private String dni;
    private int edad;


    public Persona(String nom, String dni, int edad) {
        this.nom = nom;
        this.dni = dni;
        this.edad = edad;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }
}
