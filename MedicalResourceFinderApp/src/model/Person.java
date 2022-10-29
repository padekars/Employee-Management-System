/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author snehal
 */
public class Person {
    String personid;
    String persontype;
    String personname;
    int personage;
    String personcontactno;
    String personemailid;
    String persondob;
    String City;
    String Community;
    String House;
    String personpass;
    
    public Person (String personid, String personname, int personage)
    {
        this.personid = personid;
        this.personname = personname;
        this.personage = personage;
        
    }

    public String getPersonpass() {
        return personpass;
    }

    public void setPersonpass(String personpass) {
        this.personpass = personpass;
    }



    public String getPersoncontactno() {
        return personcontactno;
    }

    public void setPersoncontactno(String personcontactno) {
        this.personcontactno = personcontactno;
    }

    public String getPersonemailid() {
        return personemailid;
    }

    public void setPersonemailid(String personemailid) {
        this.personemailid = personemailid;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getPersontype() {
        return persontype;
    }

    public void setPersontype(String persontype) {
        this.persontype = persontype;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public int getPersonage() {
        return personage;
    }

    public void setPersonage(int personage) {
        this.personage = personage;
    }

    public String getPersondob() {
        return persondob;
    }

    public void setPersondob(String persondob) {
        this.persondob = persondob;
    }

     @Override
    public String toString(){
        return personid;
    }
    
    
    
}
