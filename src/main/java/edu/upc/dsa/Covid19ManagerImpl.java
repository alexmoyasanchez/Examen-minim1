package edu.upc.dsa;

import edu.upc.dsa.clases.Usuario;
import edu.upc.dsa.clases.Vacuna;
import edu.upc.dsa.clases.Seguimiento;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.apache.log4j.Logger;
import java.util.*;


public class Covid19ManagerImpl implements Covid19Manager {
    HashMap<String, Usuario> usuarios = new HashMap();
    List<Vacuna> listaVacunas = new LinkedList<>();
    ArrayList<Vacuna> vacunaArrayList = new ArrayList<>();
    List<Seguimiento> listaSeguimientos = new LinkedList<>();

    static final Logger logger = Logger.getLogger(Covid19ManagerImpl.class.getName());


    private static Covid19ManagerImpl manager;

    public static Covid19ManagerImpl getInstance() {
        if (manager == null) {
            manager = new Covid19ManagerImpl();
        }

        return manager;
    }
    public void addVacunaAPersona(String idUser, String vacuna, int ordre){
        Usuario user = getUsuarioById(idUser);
        Vacuna vacunaTemp = getVacunaById(vacuna);
        if(user != null){
            logger.info("Usaurio encontrado");
            user.setOrdre(ordre);
            user.setMarcaVacuna(vacuna);
            listaVacunas.add(vacunaTemp);
        }
        else
            logger.error("Usuario no encontrado");
    }

    public void addVacuna (Vacuna vacuna){
        listaVacunas.add (vacuna);
    }

    public Usuario getUsuarioById (String idUser){
        Usuario user = usuarios.get(idUser);
        return user;
    }

    public Vacuna getVacunaById(String marcaVacuna){
        Vacuna vacunaTemporal = null;
        for(Vacuna vacuna : this.vacunaArrayList){
            if(vacuna.getNombre().compareTo(marcaVacuna) == 0);
                vacunaTemporal = vacuna;
        }
        return vacunaTemporal;

    }

    public void ordenarVacunaciones(){

    }

    public void ordenarVacunasAplicadas(){

    }

    public void addSeguimiento(String idUser, Seguimiento seguimiento) {
        Usuario user = getUsuarioById(idUser);
        List<Seguimiento> seguimientos = user.getSeguimientosRealizados();
        seguimientos.add(seguimiento);
        user.setSeguimientosRealizados(seguimientos);

    }

    public void listarSeguimientos(String idUser){
        Usuario user = getUsuarioById(idUser);
        List<Seguimiento> listaSeguimientos = user.getSeguimientosRealizados();
        for(Seguimiento s:listaSeguimientos) {
            logger.info("Numero seguimiento: " + s.getOrdre());
            logger.info("Descripcion seguimiento: " + s.getDescripcion());
        }
    }

    public void addUsuario(String user, String vacuna, int ordre){
        Usuario usuario = new Usuario();
        usuarios.put(user, usuario);
    }

    public static void delete() {
        manager = null;
        logger.info("Instancia CovidManagerImpl borrada");
    }

    public void muestraVacunados(){
        for(Vacuna vacuna : listaVacunas){
            logger.info("Vacunas: " + vacuna);
        }
    }

    public void clear() {
        this.listaVacunas.clear();
        this.usuarios.clear();
        this.vacunaArrayList.clear();
        this.listaSeguimientos.clear();
    }
}
