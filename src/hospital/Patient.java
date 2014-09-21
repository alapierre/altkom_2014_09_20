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
    
    private ArrayList<Symptom> symptoms;    
    private ArrayList<Object> history;    
    private ArrayList<String> alergies;
       
    private Object insurance;
    private Doctor attendingDoctor;
    private PatientRoom ward;
    private Menu dietPlan;
    
    private Date dateOfAdmission;
    private Date dateOfDischarge;

    public Patient() {
        symptoms = new ArrayList<>(); 
        history = new ArrayList<>();
        alergies = new ArrayList<>();    
    }
    
    public void addSymptom(Symptom symptom)
    {
        symptoms.add(symptom);
    }
    
    public ArrayList<Symptom> getSymptoms()
    {
        return this.symptoms;
    }
        
    public void payBill() {
        if(insurance == null)
        {
            System.out.println("Zapłacono z własnej kieszeni");
        }
        else
        {            
            System.out.println("Zapłacono z ubezpieczenia");
        }
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

    @Override
    public String toString() {
        return "Patient{" + "symptoms=" + symptoms + ", history=" + history + ", alergies=" + alergies + ", insurance=" + insurance + ", attendingDoctor=" + attendingDoctor + ", ward=" + ward + ", dietPlan=" + dietPlan + ", dateOfAdmission=" + dateOfAdmission + ", dateOfDischarge=" + dateOfDischarge + '}';
    }
    
    
    
    /*********** Getters ***********/    
    
    
    public ArrayList<Object> getHistory() {
        return history;
    }

    public ArrayList<String> getAlergies() {
        return alergies;
    }

    public Object getInsurance() {
        return insurance;
    }

    public Doctor getAttendingDoctor() {
        return attendingDoctor;
    }

    public PatientRoom getWard() {
        return ward;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public Date getDateOfDischarge() {
        return dateOfDischarge;
    }
  
    public Menu getDietPlan() {
        return dietPlan;
    }
    
    /*********** Setters ***********/ 
    
    
    public void setSymptoms(ArrayList<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public void setHistory(ArrayList<Object> history) {
        this.history = history;
    }

    public void setAlergies(ArrayList<String> alergies) {
        this.alergies = alergies;
    }

    public void setInsurance(Object insurance) {
        this.insurance = insurance;
    }

    public void setAttendingDoctor(Doctor attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    public void setWard(PatientRoom ward) {
        this.ward = ward;
    }

    private void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
    
     private void setDateOfDischarge(Date dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }
     
     public void setDietPlan(Menu dietPlan) {
        this.dietPlan = dietPlan;
    }
    
}
