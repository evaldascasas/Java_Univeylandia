/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import classesPrincipals.Client;
import java.util.ArrayList;

/**
 *
 * @author manel
 */
public class AltaClient {

    public static int control = 1;

    public static void altaClient(ArrayList<Client> arrayClient, String nom, String cognom, String DNI) {

        String idClient = Integer.toString(control);
        String idPersona = Integer.toString(control);
        arrayClient.add(new Client(idClient, nom, cognom, DNI, idPersona));

        control++;

        System.out.println(classesPrincipals.EstructuraDades.llistarClients());
    }
}
