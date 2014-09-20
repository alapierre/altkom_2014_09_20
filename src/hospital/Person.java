/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author student
 */
public class Person {
    
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + '}';
    }
    
    
    
}
