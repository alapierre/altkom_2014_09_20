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
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
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
        return "Symptom{" + "name=" + name + ", description=" + description + '}';
    }
    
    
}
