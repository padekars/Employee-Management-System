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
public class VitalsignsDirectory {
     private static VitalsignsDirectory vitalinstance = null;
    private ArrayList<VitalSigns> vitallist = new ArrayList<VitalSigns>();
    
    public VitalsignsDirectory(){
        
    }
    
    public static VitalsignsDirectory getVitalinstance(){
    if(vitalinstance == null)
    {
        vitalinstance = new VitalsignsDirectory();
        return vitalinstance;
    }
    return vitalinstance;
    }

    public static void setVitalinstance(VitalsignsDirectory vitalinstance) {
        VitalsignsDirectory.vitalinstance = vitalinstance;
    }

    public ArrayList<VitalSigns> getVitallist() {
        return vitallist;
    }

    public void setVitallist(ArrayList<VitalSigns> vitallist) {
        this.vitallist = vitallist;
    }

   
    
    public void addNewVitals(VitalSigns h){
        this.vitallist.add(h);
    }
    public void deleteVital(VitalSigns h){
        this.vitallist.remove(h);
    }
}
