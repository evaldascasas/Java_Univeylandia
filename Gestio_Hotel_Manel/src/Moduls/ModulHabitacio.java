package Moduls;
import GestioHotelLog.GestioHotelLog;
import classesPrincipals.EstructuraDades;
import classesPrincipals.Habitacio;
import java.io.File;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.logging.Level;


/**
 * Classe amb els mòduls de habitació
 * @author Evaldas Casas
 * @version v0.1
 */

public class ModulHabitacio {
    
    /**
     * Funció crearHabitacio
     * Es crea un objecte Habitació, se li setejen les dades i s'afegeix l'objecte a l'array d'habitacions.
     * @param numHab
     * @param tipusHab
     * @param numLlits
     * @param tipusLlits
     * @param estatHab
     */
    public static void crearHabitacio(String numHab, String tipusHab, int numLlits, String tipusLlits, String estatHab) {
        try {
            Habitacio hab = new Habitacio();
            hab.setNumHabitacio(numHab);
            hab.setTipusHabitacio(tipusHab);
            hab.setNumLlits(numLlits);
            hab.setTipusLlits(tipusLlits);
            hab.setEstatHabitacio(estatHab);

            EstructuraDades.arrayHabitacio.add(hab);
            JOptionPane.showMessageDialog(null, "S'ha afegit el registre correctament!");
            
            GestioHotelLog.LOGGER.log(Level.INFO, "S''ha afegit el registre: {0}", hab.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e);
            GestioHotelLog.LOGGER.log(Level.INFO, "Excepcio: {0}", e);
        }
        
    }
    
    /**
     * Funció guardarInforme
     * Imprimeix tot el array de Habitacions en un arxiu de text
     * 
     */
    public static void guardarInforme() {
        Calendar calendari = Calendar.getInstance();
        String dia = Integer.toString(calendari.get(Calendar.DATE));
        String mes = Integer.toString(calendari.get(Calendar.MONTH));
        String any = Integer.toString(calendari.get(Calendar.YEAR));
        String fitxerOut = "./informes/InformeHabitacions-"+dia+'-'+mes+'-'+any+".txt";
        File fitxer_sortida = new File (fitxerOut);
        
        try {
            PrintStream escriptor = new PrintStream(fitxer_sortida);
            escriptor.println(String.format("%20s %20s %20s %20s %20s", "Número Habitació", "Tipus Habitació", "Número Llits", "Tipus Llits", "Estat Habitació"));
            Iterator<Habitacio> habIterator = EstructuraDades.arrayHabitacio.iterator();
            while (habIterator.hasNext()) {
                Habitacio hab = habIterator.next();
                escriptor.println(String.format("%20s %20s %20s %20s %20s",hab.getNumHabitacio(),hab.getTipusHabitacio(),hab.getNumLlits(),hab.getTipusLlits(),hab.getEstatHabitacio()));
            }
            escriptor.close();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            GestioHotelLog.LOGGER.log(Level.INFO, "Excepcio: {0}", e);
        }
        
    }
        
}