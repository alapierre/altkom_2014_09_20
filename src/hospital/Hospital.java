/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import hospital.util.List;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Patient> list = new List<>();
        
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
        
        System.out.println("0. Wyście");

    }



}
