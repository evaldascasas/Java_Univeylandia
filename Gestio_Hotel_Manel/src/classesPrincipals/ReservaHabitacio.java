/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesPrincipals;

/**
 *
 * @author manel
 */
public class ReservaHabitacio {
    private String IdCLient;
    private String nomClient;
    private String cognomClient;
    private String dniClient;
    private String idHabitacio;
    private String numHabitacio;
    private String tipusHabitacio;
    private String dataEntrada;
    private String dataSortida;
    private String estatReserva;

    public ReservaHabitacio(String IdCLient, String nomClient, String cognomClient, String dniClient, 
           String numHabitacio, String tipusHabitacio, String dataEntrada, String dataSortida, String estatReserva) {
        this.IdCLient = IdCLient;
        this.nomClient = nomClient;
        this.cognomClient = cognomClient;
        this.dniClient = dniClient;
        //this.idHabitacio = idHabitacio;
        this.numHabitacio = numHabitacio;
        this.tipusHabitacio = tipusHabitacio;
        this.dataEntrada = dataEntrada;
        this.dataSortida =  dataSortida;
        this.estatReserva = estatReserva;
    }

    public String getNumHabitacio() {
        return numHabitacio;
    }

    public void setNumHabitacio(String numHabitacio) {
        this.numHabitacio = numHabitacio;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSortida() {
        return dataSortida;
    }

    public void setDataSortida(String dataSortida) {
        this.dataSortida = dataSortida;
    }

    public String getEstatReserva() {
        return estatReserva;
    }

    public void setEstatReserva(String estatReserva) {
        this.estatReserva = estatReserva;
    }

    public String getIdCLient() {
        return IdCLient;
    }

    public void setIdCLient(String IdCLient) {
        this.IdCLient = IdCLient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getCognomClient() {
        return cognomClient;
    }

    public void setCognomClient(String cognomClient) {
        this.cognomClient = cognomClient;
    }

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    public String getIdHabitacio() {
        return idHabitacio;
    }

    public void setIdHabitacio(String idHabitacio) {
        this.idHabitacio = idHabitacio;
    }

    public String getTipusHabitacio() {
        return tipusHabitacio;
    }

    public void setTipusHabitacio(String tipusHabitacio) {
        this.tipusHabitacio = tipusHabitacio;
    }

    @Override
    public String toString() {
        return "ReservaHabitacio{" + "IdCLient=" + IdCLient + ", nomClient=" + nomClient + ", cognomClient=" + cognomClient + ", dniClient=" + dniClient + ", idHabitacio=" + idHabitacio + ", tipusHabitacio=" + tipusHabitacio + '}';
    }
    
    
}
