/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

/**
 *
 * @author Student
 */
public class repositoriodigital {
    
    protected String formato;
    protected int Tamanio;

    public String getFormato() {
        return formato;
    }

    public int getTamanio() {
        return Tamanio;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public repositoriodigital(String formato, int Tamanio) {
        this.formato = formato;
        this.Tamanio = Tamanio;
    }
    
    

}
