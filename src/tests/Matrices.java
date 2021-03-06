package tests;

import java.util.logging.Level;
import java.util.logging.Logger;
import matrices.DimensionesIncompatibles;
import matrices.Matriz;

public class Matrices {

    public static void main(String[] args) {
         System.out.println("Originales");
        Matriz m1 = new Matriz(3, 4, true);
        System.out.println(m1);
        Matriz m2 = new Matriz(3, 4, true);
        System.out.println(m2);
        try {
            System.out.println("Suma");
            System.out.println(Matriz.sumarDosMatrices(m1, m2));
            System.out.println(Matriz.Trasponer(m1));
            System.out.println("Originales");
            m1 = new Matriz(3, 4, true);
            System.out.println(m1);
            m2 = new Matriz(4, 3, true);            
            System.out.println(m2);
            System.out.println("Multiplicación");
            System.out.println(Matriz.Multiplicar(m1, m2));
        } catch (DimensionesIncompatibles ex) {
            ex.printStackTrace();
        }
    }
    
}
