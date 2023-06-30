package Objetos;

public class Carrera {
    private String codigo;
    private String nombreCarrera;
    private String semestres;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getSemestres() {
        return semestres;
    }

    public void setSemestres(String semestres) {
        this.semestres = semestres;
    }

    public Carrera(String nombre, String codigo, String semestres) {
        this.codigo = codigo;
        this.nombreCarrera = nombre;
        this.semestres = semestres;
    }
}
