/*
 */
package hospital;
public class Menagement extends Person {
    private String resposibility;
    
    public Menagement(String name, String surname, String pesel, String responsibility) { 
        this.resposibility = responsibility;
    }

    public String getResposibility() {
        return resposibility;
    }

    public void setResposibility(String resposibility) {
        this.resposibility = resposibility;
    }

    @Override
    public String toString() {
        return "MenagementImpl{" + "resposibility=" + resposibility + ", name=" + getName() + ", surname=" + getLastName() + ", pesel=" + /*getPesel() +*/ '}';
    }

    
   
   
    
    
    
}
