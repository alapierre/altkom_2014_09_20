/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author student
 */
public class Nutritionist {
    
    private String name;
    private String surname;
    private String createDiet;

    public String getCreateDiet() {
        return createDiet;
    }

    public void setCreateDiet(String createDiet) {
        this.createDiet = createDiet;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Nutritionist{" + "name=" + name + ", surname=" + surname + ", createDiet=" + createDiet + '}';
    }

 
    
    
}
