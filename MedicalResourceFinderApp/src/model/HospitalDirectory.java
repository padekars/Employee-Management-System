/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author snehal
 */
public class HospitalDirectory {
    private static HospitalDirectory hospinstance = null;
    private ArrayList<Hospital> hospitallist = new ArrayList<Hospital>();
    
    public HospitalDirectory(){
        
    }
    
    public static HospitalDirectory getHospinstance(){
    if(hospinstance == null)
    {
        hospinstance = new HospitalDirectory();
        return hospinstance;
    }
    return hospinstance;
    }

    public ArrayList<Hospital> getHospitallist() {
        return hospitallist;
    }

    public void setHospitallist(ArrayList<Hospital> hospitallist) {
        this.hospitallist = hospitallist;
    }
    
    public void addNewHospital(Hospital h){
        this.hospitallist.add(h);
    }
    public void deleteHospital(Hospital h){
        this.hospitallist.remove(h);
    }
}
