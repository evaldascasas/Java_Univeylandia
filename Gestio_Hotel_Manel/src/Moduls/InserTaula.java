/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import classesPrincipals.Taula;
import java.util.ArrayList;

/**
 *
 * @author manel
 */
public class InserTaula {

    public static int control = 1;

    public static String altaTaula(ArrayList<Taula> arrayTaula, String numeroTaula, String numeroCadires, String estatTaula) {
        String Llista = "";

        String idTaula = Integer.toString(control);

        arrayTaula.add(new Taula(idTaula, numeroTaula, numeroCadires,estatTaula));

        control++;
        
        return Llista;
    }
}
