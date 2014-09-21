/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import hospital.Person;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.Date;

/**
 *
 * @author student
 */
public class FileTest {
    
    
    public static void main(String[] args) {
        //writeToFile(); 
        
        //readFromFile();
        
        //saveObject();
        
        //readFromFile();
        
        //writeToFile();
        
        //saveObject();
        
        readObject();
    }
    
    public static void readObject() {
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.out") {})) {
            
            Person p = (Person) in.readObject();
            
            System.out.println(p);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex)  {
            ex.printStackTrace();
        }
                
        
    }
    
    public static void saveObject() {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.out")) ) {
            
            Person p = new Person();
            p.setName("Ala");
            p.setLastName("Kowalska");
            
            out.writeObject(p);
            
        } catch (IOException ex) {
            System.out.println("błąd zapisu");
            ex.printStackTrace();
        }
                
        
    }
    
    public static void readFromFile() {
        
        File f = new File("test.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            
            String line = reader.readLine();
            
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            
        } catch(IOException ex) {
            System.out.println("Problem z odczytem pliku");
        }
        
    }

    private static void writeToFile() {
        File f = new File("test.txt");
        
        try(Writer writer = new BufferedWriter(new FileWriter(f))) {
            
            System.out.println(f);
            System.out.println(f.getAbsoluteFile());
            
            writer.append("Ala ma kota a kot ma Alę");
            
        } catch (IOException ex) {
            System.out.println("problem z utworzeniem pliku: " + ex.getMessage());
        }
    }
}
