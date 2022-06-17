/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC
 */
public class Equipo {
      private String nombreEquipo;
      private String nombreJugador;
      private String posicionJugadores;
      private String nombreEstadio;

    public Equipo(String nombreEquipo, String nombreJugador, String posicionJugadores, String nombreEstadio) {
        this.nombreEquipo = nombreEquipo;
        this.nombreJugador = nombreJugador;
        this.posicionJugadores = posicionJugadores;
        this.nombreEstadio = nombreEstadio;
    }

   

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPosicionJugadores() {
        return posicionJugadores;
    }

    public void setPosicionJugadores(String posicionJugadores) {
        this.posicionJugadores = posicionJugadores;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", nombreJugador=" 
                + nombreJugador + ", posicionJugadores=" + posicionJugadores 
                + ", nombreEstadio=" + nombreEstadio + '}';
    }
}
