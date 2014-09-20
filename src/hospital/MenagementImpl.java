/*
 */
package hospital;
public class MenagementImpl extends Hospital {

    private String resposibility;
    private String name;
    private String surname;
    private String pesel;

    public MenagementImpl(String name, String surname, String pesel, String responsibility) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.resposibility = responsibility;
    }

    public String getResposibility() {
        return resposibility;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setResposibility(String resposibility) {
        this.resposibility = resposibility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "MenagementImpl{" + "resposibility=" + resposibility + ", name=" + name + ", surname=" + surname + ", pesel=" + pesel + '}';
    }

    
   
   
    
    
    
}
