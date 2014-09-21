/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.util;

/**
 *
 * @author student
 */
public class List implements Storage {

    private Object[] tab = new Object[10];
    private int current;
    
    @Override
    public void add(Object item) {
        if(current >= tab.length ) {
            Object[] tmp = new Object[tab.length + 10];
            System.arraycopy(tab, 0, tmp, 0, tab.length);
            tab = tmp;
        } 
        
        tab[current++] = item;
        
    }

    @Override
    public Object get(int idx) {
        return tab[idx];
    }
    
    public int size() {
        return current + 1;
    }
}
