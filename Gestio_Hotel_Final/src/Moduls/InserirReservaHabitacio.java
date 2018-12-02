/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import GestioHotelLog.GestioHotelLog;
import classesPrincipals.Client;
import classesPrincipals.Habitacio;
import classesPrincipals.ReservaHabitacio;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author manel
 */
public class InserirReservaHabitacio {

    public static String nomClient;
    public static String cognomClient;
    public static String dniClient;
    public static String idClientc;
    public static String numeroHab;
    public static String tipHab;
    public static int numerollit;
    public static String tipsLlit;
    public static String estatHab;
    
    public static String InserirHabitacio(String nom, String cognom, String DNI, String IDClient) {

        nomClient = nom;
        cognomClient = cognom;
        dniClient = DNI;
        idClientc = IDClient;

        String llista = nomClient + cognomClient + dniClient + idClientc;
        
        System.out.println(llista);
        return llista;
    }
    
    public static String InserirHabit( String numHab, String tiphab, int numLlit,String tipusLlit, String estat){
        
        numeroHab = numHab;
        tipHab = tiphab;
        numerollit = numLlit;
        tipsLlit = tipusLlit;
        estatHab = estat;
        
        String llistaHab = numHab+tipHab;
        System.out.println(llistaHab);
        return llistaHab;
    }
    
    public static void inserirReservaHab(ArrayList<ReservaHabitacio> arrayReservaHab,String nom, String cognom, String DNI, String IDClient,
            String numHabitacio, String tipusHabitacio, String dataEntrada, String dataSortida, String estatReserva){
        
        arrayReservaHab.add(new ReservaHabitacio(IDClient, nom, cognom, DNI, numHabitacio, tipusHabitacio, dataEntrada, dataSortida, estatReserva));
        
        JOptionPane.showMessageDialog(null, "S'ha afegit el registre correctament!");
            
    }
}
