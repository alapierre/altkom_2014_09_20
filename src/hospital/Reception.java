package hospital;

import java.util.ArrayList;

public class Reception {
    private ArrayList<Patient> patients = null;
    private Person actualReceptionist = null;
    private long phoneNr = -1;

    public Reception() {
        patients = new ArrayList<Patient>();
        phoneNr = 507_555_999;
    }
    
    public void registerPatient(Patient patient){
        patients.add(patient);
    }

    public void unregisterPatient(Patient patient){
        patients.remove(patient);
    }
    public Person getActualReceptionist() {
        return actualReceptionist;
    }

    public void setActualReceptionist(Person actualReceptionist) {
        this.actualReceptionist = actualReceptionist;
    }

    public long getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(long phoneNr) {
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        String result = ("Recepcja, Telefon: " + phoneNr 
                + ", Osoba rejestrująca: " + actualReceptionist 
                + ", Pacjenci:" );
        
        for(Patient patient : patients){
            result += patient.getName();
        }
        
        return result;
    }

    
}

