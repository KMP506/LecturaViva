/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesEducativas;

import bibliotecas.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Student
 */
public class ClubLibro extends ActividadE {
     public ClubLibro(String nombre, LocalDate fecha, LocalTime hora, int cupoMax[], Usuario usuariosInscritos) {
        super(nombre, fecha, hora, cupoMax, usuariosInscritos);
    }
}
