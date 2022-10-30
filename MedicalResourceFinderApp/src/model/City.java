/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class City {
    String Cityid;
    String Cityname;
    String Citycode;
    
    public City(String Cityid, String Cityname, String Citycode){
        this.Cityid = Cityid;
        this.Cityname = Cityname;
        this.Citycode = Citycode;
    }

    public String getCityid() {
        return Cityid;
    }

    public void setCityid(String Cityid) {
        this.Cityid = Cityid;
    }

    public String getCityname() {
        return Cityname;
    }

    public void setCityname(String Cityname) {
        this.Cityname = Cityname;
    }

    public String getCitycode() {
        return Citycode;
    }

    public void setCitycode(String Citycode) {
        this.Citycode = Citycode;
    }
    
    @Override
    public String toString()
    {
        return Cityid;
    }
    
    
}
