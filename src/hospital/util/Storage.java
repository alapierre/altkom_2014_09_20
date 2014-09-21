/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.util;

/**
 *
 * @author student
 */
public interface Storage<T> {
    
    public void add(T item);
    
    public T get(int idx);
    
}
