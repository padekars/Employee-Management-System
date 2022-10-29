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
    private static DoctorDirectory doctorinstance = null;
    private ArrayList<Doctor> doctorlist = new ArrayList<Doctor>();
    

    public DoctorDirectory() {
        //this.doctorlist = new ArrayList<Doctor>();
    }
    
    public static DoctorDirectory getDoctorinstance(){
        if(doctorinstance == null)
        {
            doctorinstance = new DoctorDirectory();
            return doctorinstance;
        }
        return doctorinstance;
    }
    
    public ArrayList<Doctor> getDoctorlist() {
        return this.doctorlist;
    }

    public void setDoctorlist(ArrayList<Doctor> doctorlist) {
        this.doctorlist = doctorlist;
    }
    
    // fetch a doctor object given username and password
    

    public void addNewDoctor(Doctor d)
    {
       this.doctorlist.add(d);
    }
    public void deleteDoctor(Doctor d){
        this.doctorlist.remove(d);
        
    }
}
