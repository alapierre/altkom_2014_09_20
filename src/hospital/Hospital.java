/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import hospital.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Hospital {
    
    protected static final String HOSPITALOUT = "hospital.out";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File(HOSPITALOUT);
        
        List<Patient> list = null;
        
        if(file.exists()) {
            list = loadFromBinaryFile();
            if(list == null) list = new List<>();
            System.out.println("Ładuję dane");
        } else {
            list = new List<>();
            
            System.out.println("brak pliku z danymi");
        }
        
        Scanner keyboard = new Scanner(System.in);
        
        petla_glowna: while (true) {
            
            showMainMenu();

            int option = readKeyboard(keyboard);

            System.out.println("wybrano " + option);
            
            //list.add("ala ma kota");
            
            switch (option) {
                case 1:
                    Patient p = readPatientFromKeyboard(keyboard);
                    list.add(p);
                    break;
                case 2:
                    
                    for(int i = 0; i < list.size() - 1; i++) {
                        Patient tmp = list.get(i);
                        System.out.println(tmp.getName() + " " + tmp.getLastName());
                    }
                    
                    break;
                case 3 :
                    saveToBinaryFile(list);
                    break;
                case 0:
                    break petla_glowna;
                    
                default:
                    System.out.println("nieistniejąca opcja");
            }
            
        }

        System.out.println("Koniec.");

    }

    public static int readKeyboard(Scanner in) {

        while (!in.hasNextInt()) {
            System.out.println("błędny wybór");
            in.next();
        }

        return in.nextInt();


    }
    
    public static Patient readPatientFromKeyboard(Scanner in) {
        
        Patient p = new Patient();
        
        System.out.println("Podaj imie");
        p.setName(in.next());
        
        System.out.println("Podaj nazwisko");
        p.setLastName(in.next());
        
        System.out.println("Podaj NIP");
        p.setNip(in.next());
        
        return p;
        
    }

    public static void showMainMenu() {

        System.out.println("1. Przyjmij pacjenta na oddział");
        System.out.println("2. Wyświetl listę pacjentów");
        System.out.println("3. Zapisz listę pacjentów");
        
        System.out.println("0. Wyście");

    }

    private static void saveToBinaryFile(List list) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(HOSPITALOUT)) ) {
            
            out.writeObject(list);
            
        } catch (IOException ex) {
            System.out.println("błąd zapisu");
            ex.printStackTrace();
        }
        
    }
    
    public static List loadFromBinaryFile() {
        
        List<Person> list = null;
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(HOSPITALOUT))) {
            
            list = (List<Person>) in.readObject();
            
            return list;
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex)  {
            ex.printStackTrace();
        }
        
        return list;
        
    }



}
