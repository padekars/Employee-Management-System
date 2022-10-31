/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class Patient extends Person{
  
   String bloodgroup;
   
   public Patient(String personid, String personname, int personage, String bloodgroup,String personpass)
   {
       super(personid,personname,personage,personpass);
       this.bloodgroup = bloodgroup;
   }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

   
 
}
