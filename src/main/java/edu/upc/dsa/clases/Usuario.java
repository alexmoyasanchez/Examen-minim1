package edu.upc.dsa.clases;

import edu.upc.dsa.clases.Seguimiento;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    public String nombre;
    public String marcaVacuna;
    public int ordre;
    public List<Seguimiento> seguimientosRealizados = new LinkedList<>();

    public Usuario(){
    }



    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarcaVacuna() {
        return marcaVacuna;
    }

    public void setMarcaVacuna(String marcaVacuna) {
        this.marcaVacuna = marcaVacuna;
    }


    public List<Seguimiento> getSeguimientosRealizados() {
        return seguimientosRealizados;
    }

    public void setSeguimientosRealizados(List<Seguimiento> seguimientosRealizados) {
        this.seguimientosRealizados = seguimientosRealizados;
    }

    public int numeroSeguimientos(){
        return this.seguimientosRealizados.size();
    }
}
