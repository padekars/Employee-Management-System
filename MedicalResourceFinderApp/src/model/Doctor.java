/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class Doctor extends Person {
    String dspecz;
    String dcity;
    String dcommunity;
    String dhos;
    public Doctor(String personid,String personname,int personage,String personpass,String dspecz, String dcity, String dcommunity, String dhos){
        super(personid,personname,personage,personpass);
        this.dspecz = dspecz;
        this.dcity = dcity;
        this.dcommunity = dcommunity;
        this.dhos = dhos;
        
    
    }

    public String getDcity() {
        return dcity;
    }

    public void setDcity(String dcity) {
        this.dcity = dcity;
    }

    public String getDcommunity() {
        return dcommunity;
    }

    public void setDcommunity(String dcommunity) {
        this.dcommunity = dcommunity;
    }

    public String getDhos() {
        return dhos;
    }

    public void setDhos(String dhos) {
        this.dhos = dhos;
    }

    public String getDspecz() {
        return dspecz;
    }

    public void setDspecz(String dspecz) {
        this.dspecz = dspecz;
    }
    
}
