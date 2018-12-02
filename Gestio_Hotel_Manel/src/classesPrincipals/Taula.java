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
public class Taula {
    private String numTaula;
    private String idTaula;
    private String numCadires;
    private String estatTaula;

    public Taula(String idTaula,String numTaula,String numCadires, String estatTaula) {
        this.numTaula = numTaula;
        this.idTaula = idTaula;
        this.numCadires = numCadires;
        this.estatTaula = estatTaula;
    }

    public void setEstatTaula(String estatTaula) {
        this.estatTaula = estatTaula;
    }

    public void setNumTaula(String numTaula) {
        this.numTaula = numTaula;
    }

    public void setIdTaula(String idTaula) {
        this.idTaula = idTaula;
    }

    public void setNumCadires(String numCadires) {
        this.numCadires = numCadires;
    }

    public String getNumTaula() {
        return numTaula;
    }

    public String getIdTaula() {
        return idTaula;
    }

    public String getNumCadires() {
        return numCadires;
    }

    public String getEstatTaula() {
        return estatTaula;
    }

    @Override
    public String toString() {
        return "Taula: " + ", idTaula = " + idTaula + "numTaula = " + numTaula +" , numCadires = " + numCadires+" ,estat Taula: "+estatTaula;
    }

 
    
}
