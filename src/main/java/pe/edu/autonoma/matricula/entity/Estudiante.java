package pe.edu.autonoma.matricula.entity;

public class Estudiante {
    private Integer id;
    private String apellidos;
    private String nombres;
    private int edad;

    public Estudiante(String apellidos, String nombres, int edad) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
