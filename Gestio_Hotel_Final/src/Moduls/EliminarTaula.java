/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;
import classesPrincipals.Taula;
import classesPrincipals.EstructuraDades;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author manel
 */
public class EliminarTaula {
    
    public static void elimTaula(ArrayList<Taula> arrayTaula, String idTaula, String numTaula, String numCadires) {
        System.out.println(idTaula+numTaula+numCadires);
        boolean trobat = false;

        for (int i = 0; i < arrayTaula.size(); i++) {
            if (arrayTaula.isEmpty()) {
                JOptionPane.showInputDialog("No hi ha clients, introdueix clients.");
            }
            if (arrayTaula.get(i).getIdTaula().equalsIgnoreCase(idTaula)) {
                arrayTaula.remove(i);
                trobat = true;
                break;
            }
            
        }
    }
}
