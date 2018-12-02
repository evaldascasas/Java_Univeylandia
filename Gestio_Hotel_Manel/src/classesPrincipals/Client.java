/*
 *
 *  Creo la classe del objecte client que hereda de persona 
 * 
 */
package classesPrincipals;

/**
 *
 * @author manel
 */
public class Client extends Persona {

    private String IDClient;
    private int id;
    private static final int maxClient = 3;
    private static int numeroClient;
    private static int nextID;

    public Client(String IDClient, String Nom, String Cognom, String DNI, String ID_Persona) {
        super(Nom, Cognom, DNI, ID_Persona);
        this.IDClient = IDClient;
        this.id = id;
        numeroClient++;

    }

    public static void setNumeroClient(int numeroClient) {
        Client.numeroClient = numeroClient;
    }

    public void setIDClient(String IDClient) {
        this.IDClient = IDClient;
    }

    public String getIDClient() {
        return IDClient;
    }

    public static int getMaxClient() {
        return maxClient;
    }

    public static int getNumeroClient() {
        return numeroClient;
    }

    @Override
    public String toString() {
        return super.toString() + " IDClient=" + IDClient;
    }

}
