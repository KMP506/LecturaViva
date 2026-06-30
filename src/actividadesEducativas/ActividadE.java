/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesEducativas;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Student
 */
public class ActividadE {
    protected String nombre;
    protected LocalDate fecha;
    protected LocalTime hora;
    protected int cupoMax;
    protected Usuario usuariosInscritos[];
    
    public String getNombre(){
        return this.nombre;
    }
    
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public LocalTime getHora(){
        return this.hora;
    }
    
    public int getCupoMax(){
        return this.cupoMax;
    }
    
    public Usuario getUsuariosInscritos(){
        return this.usuariosInscritos;
    }
    
    public ActividadE(String nombre,LocalDate fecha,LocalTime hora,int cupoMax,Usuario usuariosInscritos){
        this.nombre=nombre;
        this.fecha=fecha;
        this.hora=hora;
        this.cupoMax=cupoMax;
        this.usuariosInscritos=usuariosInscritos;
    }
    
    public String ToString(){
        return "Nombre: "+nombre+
                "\nFecha: "+fecha+
                "\nHora: "+hora+
                "\nCupos maximos: "+cupoMax+
                "\nUsuarios inscritos: "+usuariosInscritos;
    }
    
}
