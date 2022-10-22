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
public class PersonDirectory {
        private ArrayList<Person> personlist;

    public PersonDirectory() {
        this.personlist = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersonlist() {
        return this.personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }
    
    // fetch a patient object given username and password
    

    public Person addNewPerson()
    {
        Person newperson = new Person();
        personlist.add(newperson);
        return newperson;
       
    }
    public void deletePerson(Person p){
        personlist.remove(p);
        
    }
}
