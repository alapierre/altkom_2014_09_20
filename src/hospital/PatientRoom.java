/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Jarek
 */
public class PatientRoom 
{
    private int roomId;
    private String roomName;
    private String roomType;
    private Object patientList;
    private Object associatedPersonel;

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

    public Object getPatientList() {
        return patientList;
    }

    public void setPatientList(Object patientList) {
        this.patientList = patientList;
    }

    public Object getAssociatedPersonel() {
        return associatedPersonel;
    }

    public void setAssociatedPersonel(Object associatedPersonel) {
        this.associatedPersonel = associatedPersonel;
    }
    
    
}
