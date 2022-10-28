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
       private ArrayList<City> citylist;

    public CityDirectory() {
        this.citylist = new ArrayList<City>();
    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.citylist = citylist;
    }
    
   
    

    public City addNewCity()
    {
        City newcity = new City();
        citylist.add(newcity);
        return newcity;
       
    }
    public void deleteCity(City c){
        citylist.remove(c);
        
    }
    
}
