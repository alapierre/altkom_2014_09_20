/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**
 *
 * @author student
 */
public class Laboratory {
    private String nazwa = new String();
    private Nurse nurse;
    private Doctor doctor;
    private Patient patient;
    
    
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    public String getNazwa() {
        return nazwa;
    }
   
    @Override
    public String toString() {
        return "Laboratory{" + '}';
    }
    
}
