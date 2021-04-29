import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.clases.Seguimiento;
import edu.upc.dsa.clases.Usuario;
import edu.upc.dsa.clases.Vacuna;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.log4j.Logger;


public class Covid19ManagerTest {
    Covid19Manager cm = Covid19ManagerImpl.getInstance();


    static final Logger logger = Logger.getLogger(Covid19ManagerImpl.class.getName());

    Usuario usuario1 = new Usuario( );
    Usuario usuario2 = new Usuario( );
    Usuario usuario3 = new Usuario( );



    public Covid19ManagerTest() {
    }

    @Before
    public void setUp() {

        Vacuna vacuna1 = new Vacuna("Pfizer");
        Vacuna vacuna2 = new Vacuna("Moderna");
        Vacuna vacuna3 = new Vacuna("AstraZeneca");

        cm.addVacuna(vacuna1);
        cm.addVacuna(vacuna2);
        cm.addVacuna(vacuna3);



        this.cm.addUsuario("Alex", null, 0);
        this.cm.addUsuario("Oscar", null, 0);
        this.cm.addUsuario("Fran", null, 0);

    }

    @Test
    public void test1() {

        Usuario usuario = cm.getUsuarioById("Alex");
        cm.addVacunaAPersona("Alex", "Pfizer", 1);
        logger.info("Nombre: " + usuario.getNombre() + "Vacuna: " + usuario.getMarcaVacuna() + "Orden :" + usuario.getOrdre());
    }

    @Test
    public void test2(){
        Usuario usuario = cm.getUsuarioById("Alex");
        logger.info("Lista seguimiento: " + usuario.seguimientosRealizados);
        Seguimiento seguimiento1 = new Seguimiento(1, "Me encuentro bien");
        cm.addSeguimiento("Oscar", seguimiento1);

    }



    @After
    public void tearDown() {
        this.cm.clear();
    }
}
