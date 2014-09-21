/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.util;

import java.io.Serializable;

/**
 *
 * @author student
 */
public class List<T> implements Storage<T>, Serializable {

    private Object[] tab = new Object[10];
    private int current;
    
    @Override
    public void add(T item) {
        if(current >= tab.length ) {
            Object[] tmp = new Object[tab.length + 10];
            System.arraycopy(tab, 0, tmp, 0, tab.length);
            tab = tmp;
        } 
        
        tab[current++] = item;
        
    }

    @Override
    public T get(int idx) {
        return (T)tab[idx];
    }
    
    public int size() {
        return current + 1;
    }
}
