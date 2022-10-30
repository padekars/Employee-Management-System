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
public class CityDirectory {
    public static CityDirectory cityinstance = null;
    public ArrayList<City> citylist = new ArrayList<City>();

    
    
    public static CityDirectory getCityinstance(){
        if(cityinstance == null)
        {
            cityinstance = new CityDirectory();
            return cityinstance;
        }
        return cityinstance;
    }
    
    
    public CityDirectory() {
        this.citylist = new ArrayList<City>();
    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.citylist = citylist;
    }
    
   
    

    public void addNewCity(City newcity)
    {
        citylist.add(newcity);
       
    }
    public void deleteCity(City c){
        citylist.remove(c);
        
    }
    
}
