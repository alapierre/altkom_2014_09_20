/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

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

        Scanner keyboard = new Scanner(System.in);
        
        petla_glowna: while (true) {
            
            showMainMenu();

            int option = readKeyboard(keyboard);

            System.out.println("wybrano " + option);
            
            switch (option) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
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

    public static void showMainMenu() {

        System.out.println("1. Przyjmij pacjenta na oddział");
        System.out.println("2. Wyświetl listę pacjentów");
        
        System.out.println("0. Wyście");

    }
}
