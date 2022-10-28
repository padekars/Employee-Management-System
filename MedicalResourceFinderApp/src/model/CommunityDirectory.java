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
public class CommunityDirectory {
    private ArrayList<Community> communitylist;
    
    public CommunityDirectory(){
        communitylist = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunitylist() {
        return communitylist;
    }

    public void setCommunitylist(ArrayList<Community> communitylist) {
        this.communitylist = communitylist;
    }
    public Community addNewCommunity()
    {
        Community newcommunity = new Community();
        communitylist.add(newcommunity);
        return newcommunity;
       
    }
    public void deleteCommunity(Community c){
        communitylist.remove(c);
        
    }
}
