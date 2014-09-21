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
    
    /**
     * Lekarstwo 
     */
    private String dosage; //dawkowanie
    private Patient patient; //pacjent
    private Doctor doctor; //lekarz
    private Date date;//data wypisania recepty

    public Recipe(String dosage, Patient patient, Doctor doctor, Date date) {
        this.dosage = dosage;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public Recipe() {
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
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
