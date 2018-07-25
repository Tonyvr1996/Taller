package patrones.structural;

import java.util.*;

/**
 * 
 */
public class MenuCalificaciones extends MenuDecorator {

    /**
     * Default constructor
     */
    public MenuCalificaciones() {
    }

    /**
     * 
     */
    private IEscalaExtrajera escala;


    /**
     * @param i
     */
    public void MenuCalificaciones(MenuOpciones i) {
        // TODO implement here
    }

    /**
     * @param calif 
     * @param pais 
     * @return
     */
    public String Convertir(Float calif, String pais) {
        // TODO implement here
        return "";
    }

    /**
     * @param op 
     * @return
     */
    public abstract Str ejecutarOpcion(int op);

}