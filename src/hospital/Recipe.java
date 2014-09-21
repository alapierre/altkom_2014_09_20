/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

import java.util.Date;

/**
 *
 * @author student
 */
public class Recipe {
    //lekarstwo
    private String dosage; //dawkowanie
    //pacjent
    Doctor doctor = new Doctor();
    Date date = new Date();//data wypisania recepty
    
   
    public Recipe() {
    }

    @Override
    public String toString() {
        return "Recipe{" + "dosage=" + dosage + ", date=" + date + '}';
    }

    public String getDosage() {
        return dosage;
    }

    public Date getDate() {
        return date;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
