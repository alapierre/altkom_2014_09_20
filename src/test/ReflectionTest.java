/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import hospital.Departament;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ReflectionTest {
    
    public static void main(String[] args) {
        
        Departament departament = new Departament();
        departament.setName("Ala ma kota");
        
        inspectObject(departament);
        
    }
    
    public static void inspectObject(Object o)  {
        
        Class clazz = o.getClass();
        
        Field[] fields = clazz.getDeclaredFields();
        
        System.out.println("pola w klaise:");
        
        for(Field f : fields) {
            System.out.println(f.getName() + " typu: " + f.getType());
        }
        Method[] methods = clazz.getMethods();
        
        System.out.println("metody w klasie");
        
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        
        Constructor[] constructors = clazz.getConstructors();
        
        System.out.println("konstruktory: ");
        
        for(Constructor c : constructors) {
            System.out.println(c.getName() + " " + Arrays.toString(c.getParameterTypes()) );
        }
        try {
            
            Method m = clazz.getMethod("setName", String.class);
            m.invoke(o, "Alicja");
            
            Field f = clazz.getDeclaredField("name");
            f.setAccessible(true);
            f.set(o, "Jan");
            
            
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        Departament d = (Departament)o;
        
        System.out.println(d.getName());
        
    }
    
}
