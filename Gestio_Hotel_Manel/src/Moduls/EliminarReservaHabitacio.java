/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import classesPrincipals.ReservaHabitacio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author manel
 */
public class EliminarReservaHabitacio {

    public static void eliminarReservaHabitacio(ArrayList<ReservaHabitacio> arrayReservaHab, String DNI, String numHabitacio) {
        //System.out.println(DNI + numHabitacio);
        boolean trobat = false;

        for (int i = 0; i < arrayReservaHab.size() && trobat == false; i++) {
            if (arrayReservaHab.get(i).getDniClient() == DNI && arrayReservaHab.get(i).getNumHabitacio() == numHabitacio) {
                arrayReservaHab.remove(i);
                trobat = true;
            }

        }
    }
}
