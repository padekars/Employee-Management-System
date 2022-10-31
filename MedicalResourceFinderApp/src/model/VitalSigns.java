/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class VitalSigns extends Encounter{
    String bloodpressure;
    String heartrate;
    int oxygenlevel;
    int temperature;

    public int getOxygenlevel() {
        return oxygenlevel;
    }

    public void setOxygenlevel(int oxygenlevel) {
        this.oxygenlevel = oxygenlevel;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getHeartrate() {
        return heartrate;
    }
    

    public void setHeartrate(String heartrate) {
        this.heartrate = heartrate;
    }
    public VitalSigns(String EncounterID, String EncounterDate, String Patientname,String Doctorname, String bloodpressure, String heartrate, int oxygenlevel, int temperature){
        super( EncounterID,  EncounterDate,  Patientname, Doctorname);
        this.bloodpressure = bloodpressure;
        this.heartrate = heartrate;
        this.oxygenlevel = oxygenlevel;
    }
    
}
