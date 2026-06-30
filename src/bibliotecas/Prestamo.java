/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Prestamo {
    
    protected Usuario usuarioSolicita;
    protected String materialPrestado;
    protected LocalDate fechaPrestamo;
    protected LocalDate fechaDevolucion;
    protected LocalDate fechaRealDevolucion;

    public Usuario getUsuarioSolicita() {
        return usuarioSolicita;
    }

    public String getMaterialPrestado() {
        return materialPrestado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    
    public LocalDate getFechaRealDevolucion() {
        return fechaRealDevolucion;
    }

    public void setUsuarioSolicita(Usuario usuarioSolicita) {
        this.usuarioSolicita = usuarioSolicita;
    }

    public void setMaterialPrestado(String materialPrestado) {
        this.materialPrestado = materialPrestado;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setFechaRealDevolucion(LocalDate fechaRealDevolucion) {
        this.fechaRealDevolucion = fechaRealDevolucion;
    }

    public Prestamo(Usuario usuarioSolicita, String materialPrestado, LocalDate fechaPrestamo, LocalDate fechaDevolucion, LocalDate fechaRealDevolucion) {
        this.usuarioSolicita = usuarioSolicita;
        this.materialPrestado = materialPrestado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaRealDevolucion = fechaRealDevolucion;
    }
    
    public String toString(){
        return "Usuario: " +usuarioSolicita+
                "\nMaterial: " +materialPrestado +
                "\nFecha del Prestamo: "+ fechaPrestamo+
                "\nFecha de Devolucion: "+fechaDevolucion+
                "\nFecha Real de Devolucion: " +fechaRealDevolucion;
        
    }
    
}
