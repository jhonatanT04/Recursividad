/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicarecursividad;

/**
 *
 * @author venot
 */
public class Operaciones {
    public static int sumaValo(int n){
        if (n==1) {
            return 1;
        }else{
            int numMen =sumaValo(n-1);
            int numTo = n + numMen;
            return numTo;
        }
    }
    public static int potencia(int n,int p){
        if (p==1) {
            return n;
        }else{
            int pot = potencia(n, p-1);
            int fin = n* pot;
            return fin;
        }
    }
    public static int sumaDigit(int n){
        if (n<10) {
            return n;
        }else{
            int ultimoDigito = n%10;
            int resto = n/10;
            int cal = sumaDigit(resto);
            int resp = ultimoDigito + cal;
            return resp;
        }
    }
    
}
