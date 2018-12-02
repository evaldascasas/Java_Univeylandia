/*
 * 
 * Creo la Classe Persona per a que la classe client pugue heredar els atributs comuns
 *
 */
package classesPrincipals;

/**
 *
 * @author manel
 */
public class Persona {

    private String Nom;
    private String Cognom;
    private String DNI;
    private String ID_Persona;

    public Persona(String Nom, String Cognom, String DNI, String ID_Persona) {
        this.Nom = Nom;
        this.Cognom = Cognom;
        this.DNI = DNI;
        this.ID_Persona = ID_Persona;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setCognom(String Cognom) {
        this.Cognom = Cognom;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setID_Persona(String ID_Persona) {
        this.ID_Persona = ID_Persona;
    }

    public String getNom() {
        return Nom;
    }

    public String getCognom() {
        return Cognom;
    }

    public String getDNI() {
        return DNI;
    }

    public String getID_Persona() {
        return ID_Persona;
    }

    @Override
    public String toString() {
        return "Nom= " + Nom + ", Cognom= " + Cognom + ", DNI= " + DNI + ", ID_Persona= " + ID_Persona;
    }

}
