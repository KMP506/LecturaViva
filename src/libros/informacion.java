/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

/**
 *
 * @author Student
 */
public class informacion {
    
    protected int codigo;
    protected String titulo;
    protected String sutor;
    protected String anioPublicacion;
    protected boolean disponibilidad;

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSutor() {
        return sutor;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSutor(String sutor) {
        this.sutor = sutor;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public informacion(int codigo, String titulo, String sutor, String anioPublicacion, boolean disponibilidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.sutor = sutor;
        this.anioPublicacion = anioPublicacion;
        this.disponibilidad = disponibilidad;
    }
    
    
}
