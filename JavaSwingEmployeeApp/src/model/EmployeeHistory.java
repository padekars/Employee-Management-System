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
public class EmployeeHistory {
    private ArrayList<Employees> history;
    
    public EmployeeHistory()
    {
        this.history = new ArrayList<Employees>();
        
    }

    public ArrayList<Employees> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employees> history) {
        this.history = history;
    }
    public Employees addNewEmployee()
    {
        Employees newemployee = new Employees();
        history.add(newemployee);
        return newemployee;
        
    }
    public void deleteVitals(Employees e){
        history.remove(e);
        
    }
}
