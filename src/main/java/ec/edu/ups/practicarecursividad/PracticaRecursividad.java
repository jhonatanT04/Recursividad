/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practicarecursividad;

import java.io.File;

/**
 *
 * @author venot
 */
public class PracticaRecursividad extends Factorial{

    public static void main(String[] args) {
        /*int n= 124;
        System.out.println("Numero " + n);
        long fac = Factorial.factorialRecursivo(n);
        System.out.println(fac);
        System.out.println("Suma : "+ Operaciones.sumaValo(n));
        System.out.println("Potencia: "+Operaciones.potencia(n, 2));
        System.out.println("Suma de digitos : "+ Operaciones.sumaDigit(n));
        */
        
        String path = "C:\\Users\\venot\\OneDrive\\Escritorio\\carpetaAntiGeis";
        File mainPa = new File(path);
        Carpetas.renombrarCarpetas(mainPa);
        }

}
