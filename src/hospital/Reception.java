package hospital;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reception {
    
    private ArrayList<Patient> patients = null;
    private Person actualReceptionist = null;
    private long phoneNr = -1;

    public Reception() {
        patients = new ArrayList<>();
        phoneNr = 507_555_999;
    }
    
    public void registerPatient(Patient patient){
        patients.add(patient);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        patient.admitToHospital(date);
    }

    public void unregisterPatient(Patient patient){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        patient.dischargeFromHospital(date);
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

    public void showPatients(){
        this.toString();
    }
}

