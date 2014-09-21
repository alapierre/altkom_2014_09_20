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
    
    public void addSymptom()
    {
        
    }
    
    
    
    
    public void payBill() {
             
    }
    
    public void takeMeds() {
             
    }
    
    public void dischargeFromHospital(Date date)
    {
        
    }
    public void admitToHospital(Date date)
    {
        
    }
}
