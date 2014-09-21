/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**
 *
 * @author Rafal
 */
public class EmergencyRescue {
    private Ambulance ambulance;
   private int phoneNumber;

    @Override
    public String toString() {
        return "EmergencyRescue{" + "ambulance=" + ambulance + ", phoneNumber=" + phoneNumber + '}';
    }

    //  private duty;
    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
