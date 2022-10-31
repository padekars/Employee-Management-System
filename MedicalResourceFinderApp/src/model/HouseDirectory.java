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
public class HouseDirectory {
     private static HouseDirectory houseinstance = null;
    private ArrayList<House> houselist = new ArrayList<House>();
    
    
    public static HouseDirectory getHouseinstance(){
        if(houseinstance == null)
        {
            houseinstance = new HouseDirectory();
            return houseinstance;
        }
        return houseinstance;
    }
    
    
    public HouseDirectory(){
        //communitylist = new ArrayList<Community>();
    }

    public ArrayList<House> getHouselist() {
        return houselist;
    }

    public void setHouselist(ArrayList<House> houselist) {
        this.houselist = houselist;
    }
    
    public void addNewHouse(House c)
    {
        houselist.add(c);
        
    }
    public void deleteHouse(House c){
        houselist.remove(c);
        
    }
}
