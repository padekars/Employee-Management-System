/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class Hospital {
    
    String hospitalname;
    String hospitalcity;
    String hospitalcommunity;
    
    public Hospital(String hospitalname, String hospitalcity, String hospitalcommunity){
        this.hospitalcity = hospitalcity;
        this.hospitalcommunity = hospitalcommunity;
        this.hospitalname = hospitalname;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getHospitalcity() {
        return hospitalcity;
    }

    public void setHospitalcity(String hospitalcity) {
        this.hospitalcity = hospitalcity;
    }

    public String getHospitalcommunity() {
        return hospitalcommunity;
    }

    public void setHospitalcommunity(String hospitalcommunity) {
        this.hospitalcommunity = hospitalcommunity;
    }
    @Override
    public String toString()
    {
        return hospitalname;
    }
    
}
