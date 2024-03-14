
package primszam;

import java.util.Random;

public class PrimSzam {
        Random rnd = new Random();
        

    public static void main(String[] args) {
        int[] tomb = new int[10]; // Tömb 10 véletlenszerű számmal
        tomb[0] = 22;
        tomb[1] = 12;
        tomb[2] = 2;
        tomb[3] = 24;
        tomb[9] =100;
        tombkiir(tomb);
        
        System.out.println(" ");
        
        if (vaneprim(tomb)){
            System.out.println("A tömb tartalmaz prím számot");
        }
        else{
            System.out.println("A tömb nem tartalmaz prím számot");
        }
    }
    
  
    private static void tombkiir(int[] tomb) {
        for (int i = 0; i < tomb.length; i++){
            System.out.print(tomb[i] + " ");
        }
    }
    private static boolean vaneprim(int[] tomb) {
        for (int szam : tomb) {
            if (isPrim(szam)) {
                return true;
            }
        }
        return false; 
    }

    private static boolean isPrim(int szam) {
        if (szam <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(szam); i++) {
            if (szam % i == 0) {
                return false;
            }
        }
        return true;
    }
}
