/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author student
 */
public class Symptom {
    
    private String name;

   

    public Symptom(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
     @Override
    public String toString() {
        return "Symptom{" + "name=" + name + '}';
    }
    
}
