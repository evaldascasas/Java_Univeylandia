package classesPrincipals;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Habitació, conté totes les variables i els mètodes de la classe
 * @author Evaldas Casas
 * @version v0.1
 */

public class Habitacio {
    private int idHabitacio;
    private String numHabitacio;
    private String tipusHabitacio;
    private int numLlits;
    private String tipusLlits;
    private String estatHabitacio;
    
    private static int nextId = 0;  //variable de classe
    private static int habitacionsCreades = 0;  //variable de classe
    
    //public final static int MAX_NUM_HABITACIONS = 3;
    //public static Habitacio[] arrayHabitacio = new Habitacio[MAX_NUM_HABITACIONS];
    //public static List<Habitacio> arrayHabitacio = new ArrayList<>();
    
    public Habitacio() {
        this.idHabitacio = nextId;
        nextId++;
    }
    
    /* GETTERS */
    public int getIdHabitacio() {
        return idHabitacio;
    }
    
    public String getNumHabitacio() {
        return numHabitacio;
    }
    
    public String getTipusHabitacio() {
        return tipusHabitacio;
    }
    
    public int getNumLlits() {
        return numLlits;
    }
    
    public String getTipusLlits() {
        return tipusLlits;
    }
    
    public String getEstatHabitacio() {
        return estatHabitacio;
    }
    
    public static int getHabitacionsCreades() {
        return habitacionsCreades;
    }
    
    /* SETTERS */  
    public void setNumHabitacio(String numHabitacio) {
        this.numHabitacio = numHabitacio;
    }
    
    public void setTipusHabitacio(String tipusHabitacio) {
        this.tipusHabitacio = tipusHabitacio;
    }
    
    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }
    
    public void setTipusLlits(String tipusLlits) {
        this.tipusLlits = tipusLlits;
    }
    
    public void setEstatHabitacio(String estatHabitacio) {
        this.estatHabitacio = estatHabitacio;
    }
    
    /* MÈTODES */
    public static int augmentarHabitacionsCreades() {
        habitacionsCreades = habitacionsCreades + 1;
        return habitacionsCreades;
    }

    public static int disminuirHabitacionsCreades() {
        habitacionsCreades--;
        return habitacionsCreades;
    }
    
    //toString()
    @Override
    public String toString() {
        return this.idHabitacio+" Habitació: "+this.numHabitacio+", Tipus: "+this.tipusHabitacio+", Nº llits: "+this.numLlits+", Tipus llits: "+this.tipusLlits+", Estat: "+this.estatHabitacio;
    }
    
}

