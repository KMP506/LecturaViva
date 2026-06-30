/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Student
 */
public class Usuario {
    
     
    protected int id;
    protected String nombreCompleto;
    protected LocalDate fechaNacimiento;
    protected String telefono;
    protected String correo;
    protected String direccion;

    public int getId() {
        return id;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getFechaNacimiento() {
        return calcularEdad();
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario(int id, String nombreCompleto, LocalDate fechaNacimiento, String telefono, String correo, String direccion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    
     public int calcularEdad(){
        LocalDate fechaHoy = LocalDate.now();
        return Period.between(fechaNacimiento, fechaHoy).getYears();
    }
    
  public String toString(){
      return  "Nombre: "+nombreCompleto +
              "\nFecha de Nacimiento: "+ calcularEdad() +
              "\nTelefono: " + telefono +
              "\nCorreo: " + correo +
              "\nDireccion: "+ direccion;
  }
}
