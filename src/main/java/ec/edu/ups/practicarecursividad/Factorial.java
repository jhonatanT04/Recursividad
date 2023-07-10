/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicarecursividad;

/**
 *
 * @author venot
 */
public class Factorial {
    public static int factorialNormal(int n){
        int res = 1;
        for (int i = 1; i < n; i++) {
            System.out.println(res+" * "+i);
            res *=i;
        }
        return res;
    }
    public static long factorialRecursivo(long n){
        if (n==0) {
            return 0;
        }else{
            long factMini = factorialRecursivo(n-1);
            long fac = n * factMini;
            System.out.println("Factorial parcial de "+ n +"factorial : " +factMini);
            return fac;
        }
    }
}
