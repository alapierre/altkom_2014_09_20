/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author student
 */
public class CatteringEmployee {
    
    private String name;
    private String surname;
    private String createMeal;

    public String getCreateMeal() {
        return createMeal;
    }

    public void setCreateMeal(String createMeal) {
        this.createMeal = createMeal;
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
        return "CatteringEmployee{" + "name=" + name + ", surname=" + surname + ", createMeal=" + createMeal + '}';
    }

    
    
    
}
