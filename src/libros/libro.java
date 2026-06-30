/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

/**
 *
 * @author Student
 */
public class libro extends informacion{
    protected int totalejemplares ;
    protected int ejemplaresdisponibles;
    protected String editorial;
    protected int numerodepaginas;

    public libro(int codigo, String titulo, String sutor, String anioPublicacion, boolean disponibilidad) {
        super(codigo, titulo, sutor, anioPublicacion, disponibilidad);
    }

    public int getTotalejemplares() {
        return totalejemplares;
    }

    public int getEjemplaresdisponibles() {
        return ejemplaresdisponibles;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setTotalejemplares(int totalejemplares) {
        this.totalejemplares = totalejemplares;
    }

    public void setEjemplaresdisponibles(int ejemplaresdisponibles) {
        this.ejemplaresdisponibles = ejemplaresdisponibles;
    }
    
}
