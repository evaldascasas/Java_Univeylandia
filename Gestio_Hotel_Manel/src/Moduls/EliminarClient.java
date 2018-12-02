/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import classesPrincipals.Client;
import classesPrincipals.EstructuraDades;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author manel
 */
public class EliminarClient {

    public static void eliminarClient(ArrayList<Client> arrayClient, String nom, String cognom, String DNI,String IDPersona, String IDClient) {
        System.out.println(nom+cognom+DNI+IDPersona+IDClient);
        boolean trobat = false;

        for (int i = 0; i < arrayClient.size(); i++) {
            if (arrayClient.isEmpty()) {
                JOptionPane.showInputDialog("No hi ha clients, introdueix clients.");
            }
            if (arrayClient.get(i).getNom() == nom && arrayClient.get(i).getCognom() == cognom && arrayClient.get(i).getDNI() == DNI) {
                arrayClient.remove(i);
                trobat = true;
                break;
            }
            
        }
        
    }
}
