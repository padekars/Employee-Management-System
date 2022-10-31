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
    private static CommunityDirectory communityinstance = null;
    private ArrayList<Community> communitylist = new ArrayList<Community>();
    
    
    public static CommunityDirectory getCommunityinstance(){
        if(communityinstance == null)
        {
            communityinstance = new CommunityDirectory();
            return communityinstance;
        }
        return communityinstance;
    }
    
    
    public CommunityDirectory(){
        //communitylist = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunitylist() {
        return communitylist;
    }

    public void setCommunitylist(ArrayList<Community> communitylist) {
        this.communitylist = communitylist;
    }
    
    public void addNewCommunity(Community c)
    {
        communitylist.add(c);
        
    }
    public void deleteCommunity(Community c){
        communitylist.remove(c);
        
    }
}
