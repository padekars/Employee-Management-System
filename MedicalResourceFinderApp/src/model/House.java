/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class House {
    String Housid;
    String Housename;
    String Housestreet;
    
    public House(String Houseid, String Housename, String Housestreet){
        this.Housid = Houseid;
        this.Housename = Housename;
        this.Housestreet = Housestreet;
    }

    public String getHousestreet() {
        return Housestreet;
    }

    public void setHousestreet(String Housestreet) {
        this.Housestreet = Housestreet;
    }

    public String getHousid() {
        return Housid;
    }

    public void setHousid(String Housid) {
        this.Housid = Housid;
    }

    public String getHousename() {
        return Housename;
    }

    public void setHousename(String Housename) {
        this.Housename = Housename;
    }

    
    
    
}
