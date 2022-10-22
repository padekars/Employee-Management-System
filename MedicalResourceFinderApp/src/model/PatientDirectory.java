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
    private ArrayList<Patient> patientlist;

    public PatientDirectory() {
        this.patientlist = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientlist() {
        return this.patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }
    
    // fetch a patient object given username and password
    

    public Patient addNewPatient()
    {
        Patient newpatient = new Patient();
        patientlist.add(newpatient);
        return newpatient;
       
    }
    public void deletePatient(Patient p){
        patientlist.remove(p);
        
    }
}
