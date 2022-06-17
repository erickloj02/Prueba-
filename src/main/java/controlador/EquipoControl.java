/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Equipo;
import servicio.EquipoServicio;





/**
 *
 * @author PC
 */
public class EquipoControl {
    
    private final EquipoServicio equipoServicio = new EquipoServicio();
    
    public Equipo crear(String [] params) {
        var equipo= new Equipo(Integer.valueOf(params[0]),params[1],params[2], params[3]);
        this.equipoServicio.crear(equipo);
        return equipo;
    }
    
    public List<Equipo> listar() {
        return this.equipoServicio.listar();
    }
}
