/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import classesPrincipals.Taula;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author manel
 */
public class ModificarTaula {

    public static String numTaulaMod;
    public static String numCadiresMod;
    public static String estatMod;
    public static String idTaulaMod;

    public static void dades(String idTaula, String NumTaula, String NumCadires, String estat) {
        idTaulaMod = idTaula;
        numTaulaMod = NumTaula;
        numCadiresMod = NumCadires;
        estatMod = estat;
    }

    public static void modificarTaula(ArrayList<Taula> arrayTaula, String numTaula, String numCadires, String estat) {

        System.out.println(numTaula + " " + numCadires + " " + estat);
        System.out.println(idTaulaMod + " " + numTaulaMod + " " + numCadiresMod + " " + estatMod);

        boolean trobat = false;

        for (int i = 0; i < arrayTaula.size(); i++) {
            if (arrayTaula.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hi ha Taules, introdueix Taules.");
            }
            if (arrayTaula.get(i).getIdTaula().equalsIgnoreCase(idTaulaMod)) {

                arrayTaula.get(i).setNumTaula(numTaula);
                arrayTaula.get(i).setNumCadires(numCadires);
                arrayTaula.get(i).setEstatTaula(estat);

                System.out.println(arrayTaula.get(i).toString());
                JOptionPane.showMessageDialog(null, "Taula modificada satisfactoriament");

                trobat = true;
                break;

            }

        }

    }
}
