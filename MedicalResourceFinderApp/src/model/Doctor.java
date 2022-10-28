/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class Doctor extends Person {
    String dspecz;
    String dpass;

    public String getDpass() {
        return dpass;
    }

    public void setDpass(String dpass) {
        this.dpass = dpass;
    }

    public String getDspecz() {
        return dspecz;
    }

    public void setDspecz(String dspecz) {
        this.dspecz = dspecz;
    }
    
}
