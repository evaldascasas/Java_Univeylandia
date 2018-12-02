/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import classesPrincipals.Client;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jframesClient.JFrameModificarClient;

/**
 *
 * @author manel
 */
public class ModificarClient {

    public static String nomMod;
    public static String cogMod;
    public static String DNIMod;

    public static void dades(String Nom, String cognom, String DNI) {
        nomMod = Nom;
        cogMod = cognom;
        DNIMod = DNI;
    }

    public static void modificarClient(ArrayList<Client> arrayClient, String nom, String cognom, String DNI) {

        System.out.println(nom + cognom + DNI);
        boolean trobat = false;

        for (int i = 0; i < arrayClient.size(); i++) {
            if (arrayClient.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hi ha clients, introdueix clients.");
            }
            if (arrayClient.get(i).getNom().equals(nomMod) && arrayClient.get(i).getCognom().equalsIgnoreCase(cogMod) && arrayClient.get(i).getDNI().equalsIgnoreCase(DNIMod)) {

                arrayClient.get(i).setNom(nom);
                arrayClient.get(i).setCognom(cognom);
                arrayClient.get(i).setDNI(DNI);

                System.out.println(arrayClient.get(i).toString());

                trobat = true;
                break;
            } 

        }

    }
}
