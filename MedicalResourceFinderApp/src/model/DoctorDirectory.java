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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorlist;

    public DoctorDirectory() {
        this.doctorlist = new ArrayList<Doctor>();
    }
    
    public ArrayList<Doctor> getDoctorlist() {
        return this.doctorlist;
    }

    public void setDoctorlist(ArrayList<Doctor> doctorlist) {
        this.doctorlist = doctorlist;
    }
    
    // fetch a doctor object given username and password
    

    public Doctor addNewDoctor()
    {
        Doctor newdoctor = new Doctor();
        doctorlist.add(newdoctor);
        return newdoctor;
       
    }
    public void deleteDoctor(Doctor d){
        doctorlist.remove(d);
        
    }
}
