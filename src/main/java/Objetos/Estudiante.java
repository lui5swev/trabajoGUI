package Objetos;

public class Estudiante {
    private String nombreEstudiante;
    private String rut;
    private String matricula;
    private String carreraEstudiante;

    public Estudiante(String nombreEstudiante, String rut, String matricula, String carreraEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.rut = rut;
        this.matricula = matricula;
        this.carreraEstudiante = carreraEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarreraEstudiante() {
        return carreraEstudiante;
    }

    public void setCarreraEstudiante(String carreraEstudiante) {
        this.carreraEstudiante = carreraEstudiante;
    }
}
