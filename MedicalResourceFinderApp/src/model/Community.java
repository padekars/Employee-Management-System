/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class Community extends City{
    String Communityid;
    String Communityname;
    String Communitycode;
    
    public Community(String Cityid, String Cityname, String Citycode, String Communityid, String Communityname, String Communitycode)
    {
        super(Cityid,Cityname,Citycode);
        this.Communityid = Communityid;
        this.Communitycode = Communitycode;
        this.Communityname = Communityname;
    }

    public String getCommunityid() {
        return Communityid;
    }

    public void setCommunityid(String Communityid) {
        this.Communityid = Communityid;
    }

    public String getCommunityname() {
        return Communityname;
    }

    public void setCommunityname(String Communityname) {
        this.Communityname = Communityname;
    }

    public String getCommunitycode() {
        return Communitycode;
    }

    public void setCommunitycode(String Communitycode) {
        this.Communitycode = Communitycode;
    }
    @Override
    public String toString(){
        return Communityid;
    }
}
