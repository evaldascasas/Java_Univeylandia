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
public class ModificarReservaHabitacio {
    public static String dni;
    public static String numHab;
    public static String dataEntrada;
    public static String dataSortida;
    public static String estatReserva;
    
    public static void modificarReservaHab(String DNI,String numHabitacio,String dataIn,String dataOut,String estatRes) {
        dni = DNI;
        numHab = numHabitacio;
        dataEntrada = dataIn;
        dataSortida = dataOut;
        estatReserva = estatRes;
    }
    public static void modificarDadesReservaHabitacio(ArrayList<ReservaHabitacio> arrayReservaHab, String DNI, String numHabitacio, String dataIn, String dataOut, String estat){
        System.out.println(DNI + numHabitacio + dataIn+dataOut+estat);
        boolean trobat = false;

        for (int i = 0; i < arrayReservaHab.size(); i++) {
            if (arrayReservaHab.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hi ha clients, introdueix clients.");
            }
            if (arrayReservaHab.get(i).getDniClient().equals(dni) && arrayReservaHab.get(i).getNumHabitacio().equalsIgnoreCase(numHab) && arrayReservaHab.get(i).getDataEntrada().equalsIgnoreCase(dataEntrada)) {

                arrayReservaHab.get(i).setDniClient(DNI);
                arrayReservaHab.get(i).setNumHabitacio(numHabitacio);
                arrayReservaHab.get(i).setDataEntrada(dataIn);
                arrayReservaHab.get(i).setDataSortida(dataOut);
                arrayReservaHab.get(i).setEstatReserva(estat);

                System.out.println(arrayReservaHab.get(i).toString());

                trobat = true;
                break;
            } 

        }
    }
}
