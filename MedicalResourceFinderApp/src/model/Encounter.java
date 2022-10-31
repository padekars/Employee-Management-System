/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class Encounter {
    
    String EncounterID;
    String EncounterDate;
    String Patientname;
    String Doctorname;
    
    public Encounter(String EncounterID, String EncounterDate, String Patientname,String Doctorname){
        this.EncounterID = EncounterID;
        this.EncounterDate = EncounterDate;
        this.Doctorname = Doctorname;
        this.Patientname = Patientname;
    }

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String Patientname) {
        this.Patientname = Patientname;
    }

    public String getDoctorname() {
        return Doctorname;
    }

    public void setDoctorname(String Doctorname) {
        this.Doctorname = Doctorname;
    }

    public String getEncounterID() {
        return EncounterID;
    }

    public void setEncounterID(String EncounterID) {
        this.EncounterID = EncounterID;
    }

    public String getEncounterDate() {
        return EncounterDate;
    }

    public void setEncounterDate(String EncounterDate) {
        this.EncounterDate = EncounterDate;
    }
    
    @Override 
    public String toString(){
        return EncounterID;
    }
    
}
