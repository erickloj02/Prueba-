/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Equipo;

/**
 *
 * @author PC
 */
public class EquipoServicio {

    private final List<Equipo> equipoList = new ArrayList<>();

    @Override
     public Equipo crear(Equipo equipo) {
        this.equipoList.add(equipo);
        return equipo;
    }

    @Override
    public List<equipo> listar() {
        return this.equipoList;
    }
}

