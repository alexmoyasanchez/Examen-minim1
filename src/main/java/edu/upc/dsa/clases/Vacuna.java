package edu.upc.dsa.clases;

import java.util.List;

public class Vacuna {
    public String nombre;
    public int dosisAdministradas;

    public Vacuna(String nombre) {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDosisAdministradas() {
        return dosisAdministradas;
    }

    public void setDosisAdministradas(int dosisAdministradas) {
        this.dosisAdministradas = dosisAdministradas;
    }

}
