/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author student
 */
public class Patient extends Person {
    
    ArrayList<Symptom> symptoms = new ArrayList<Symptom>();    
    ArrayList<Object> history = new ArrayList<Object>();    
    ArrayList<Object> alergies = new ArrayList<Object>();
       
    Object insurance;
    Doctor attendingDoctor;
    Object ward;
    
    Date dateOfAdmission;
    Date dateOfDischarge;
    
    public void addSymptom(Symptom symptom)
    {
        symptoms.add(symptom);
    }
    
    public ArrayList<Symptom> getSymptoms()
    {
        return this.symptoms;
    }
        
    public void payBill() {
             
    }
    
    public void takeMeds() {
             
    }
    
    public void admitToHospital(Date date)
    {
        setDateOfAdmission(date);
    }
    
    public void dischargeFromHospital(Date date)
    {
        setDateOfDischarge(date);
    }
    
    
    /*********** Getters ***********/    
    
    
    public ArrayList<Object> getHistory() {
        return history;
    }

    public ArrayList<Object> getAlergies() {
        return alergies;
    }

    public Object getInsurance() {
        return insurance;
    }

    public Doctor getAttendingDoctor() {
        return attendingDoctor;
    }

    public Object getWard() {
        return ward;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public Date getDateOfDischarge() {
        return dateOfDischarge;
    }

    
    /*********** Setters ***********/ 
    
    
    public void setSymptoms(ArrayList<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public void setHistory(ArrayList<Object> history) {
        this.history = history;
    }

    public void setAlergies(ArrayList<Object> alergies) {
        this.alergies = alergies;
    }

    public void setInsurance(Object insurance) {
        this.insurance = insurance;
    }

    public void setAttendingDoctor(Doctor attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    public void setWard(Object ward) {
        this.ward = ward;
    }

    private void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
    
     private void setDateOfDischarge(Date dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }
}
