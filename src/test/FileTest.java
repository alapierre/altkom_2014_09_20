/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author student
 */
public class FileTest {
    
    
    public static void main(String[] args) {
        //writeToFile(); 
        
        readFromFile();
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
            
            writer.append("Ala ma kota");
            
        } catch (IOException ex) {
            System.out.println("problem z utworzeniem pliku: " + ex.getMessage());
        }
    }
}
