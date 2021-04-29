package edu.upc.dsa;

import edu.upc.dsa.clases.Seguimiento;
import edu.upc.dsa.clases.Usuario;
import edu.upc.dsa.clases.Vacuna;

public interface Covid19Manager {
    public void addVacunaAPersona(String idUser, String vacuna, int ordre);
    public Usuario getUsuarioById (String idUser);
    public void ordenarVacunaciones();
    public void addSeguimiento(String idUser, Seguimiento seguimiento);
    public void listarSeguimientos(String idUser);
    public void ordenarVacunasAplicadas();
    public Vacuna getVacunaById(String marcaVacuna);
    public void clear();
    public void muestraVacunados();
    public void addVacuna (Vacuna vacuna);
    public void addUsuario(String user, String vacuna, int ordre);








    }
