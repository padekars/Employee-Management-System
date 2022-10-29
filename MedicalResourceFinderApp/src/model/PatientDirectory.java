/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Patient;

import java.util.ArrayList;

/**
 *
 * @author snehal
 */
public class PatientDirectory {
    
    private static PatientDirectory patientinstance = null;
    private ArrayList<Patient> patientlist = new ArrayList<Patient>();

    public PatientDirectory() {
       // this.patientlist = new ArrayList<Patient>();
    }
    
        
    public static PatientDirectory getPatientinstance(){
        if(patientinstance == null)
        {
            patientinstance = new PatientDirectory();
            return patientinstance;
        }
        return patientinstance;
    }
    
    
    public ArrayList<Patient> getPatientlist() {
        return this.patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }
    
    // fetch a patient object given username and password
    

    public void addNewPatient(Patient p)
    {
        patientlist.add(p);
       
    }
    public void deletePatient(Patient p){
        patientlist.remove(p);
        
    }
}
