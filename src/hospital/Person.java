/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;

/**
 *
 * @author student
 */
public class Person implements Serializable{
    
    //private static final long serialVersionUID = 1L;
    
    private String name;
    private String lastName;
    private String nip;
    
    private int age;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
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
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", nip=" + nip + '}';
    }
    
    
}
