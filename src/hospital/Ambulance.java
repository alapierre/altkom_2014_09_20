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
public class Ambulance {
   private String registrationNumber ;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Ambulance{" + "registrationNumber=" + registrationNumber + '}';
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
   
   
}
