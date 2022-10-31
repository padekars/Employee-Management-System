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
public class EncounterDirectory {
    
    public ArrayList<Encounter> encounterlist = new ArrayList<Encounter>();

    public ArrayList<Encounter> getEncounterlist() {
        return encounterlist;
    }

    public void setEncounterlist(ArrayList<Encounter> encounterlist) {
        this.encounterlist = encounterlist;
    }
    
}
