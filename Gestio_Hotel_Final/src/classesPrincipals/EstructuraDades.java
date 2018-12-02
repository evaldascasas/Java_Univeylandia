/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesPrincipals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manel
 */
public class EstructuraDades {

    public static ArrayList<Client> arrayClient = new ArrayList<Client>();
    public static List<Habitacio> arrayHabitacio = new ArrayList<>();
    public static ArrayList<Taula> arrayTaula = new ArrayList<Taula>();
    public static ArrayList<ReservaHabitacio> arrayReservaHab = new ArrayList<ReservaHabitacio>();
    
    public static String llistarClients() {

        String llistaClient = "";

        for (Client e : arrayClient) {
            System.out.println(e.toString());
        }

        return llistaClient;
    }
}
