/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jarek
 */
public class PatientRoom
{
    private int roomId;
    private String roomName;
    private String roomType;
    private List<Patient> patientList = new ArrayList();
    private List<HospitalEmploee> associatedPersonel = new ArrayList();

    public PatientRoom() {}

    public PatientRoom(int roomId, String roomName, String roomType) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomType = roomType;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List getPatientList() {
        return patientList;
    }

    public void setPatientList(List patientList) {
        this.patientList = patientList;
    }

    public void addPatient(Patient patient) {
        this.patientList.add(patient);
    }

    public void removePatient(Patient patient) {
        this.patientList.remove(patient);
    }

    public List getAssociatedPersonel() {
        return associatedPersonel;
    }

    public void setAssociatedPersonel(List associatedPersonel) {
        this.associatedPersonel = associatedPersonel;
    }

    public void addPersonel(HospitalEmploee emploee) {
        this.associatedPersonel.add(emploee);
    }

    public void removePersonel(HospitalEmploee emploee) {
        this.associatedPersonel.remove(emploee);
    }


}
