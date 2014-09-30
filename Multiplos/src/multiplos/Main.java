/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

/**
 *
 * @author matychp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1000000000;
        long s1 = addMultiples(n, 4);
        long s2 = addMultiples(n, 7);
        long s3 = addMultiples(n, 28);
        long suma = s1 + s2 - s3;
        System.out.println("Suma de los multiplos de " + "4" + " o 7" + " menores a " + n + ": " + suma);        
    }
    
    public static long addMultiples(int n, int k){
        int c;
        if(n % k == 0){
            c = (n / k) - 1;
        }
        else{
            c = n / k;
        }
        long suma = k * ( c * (c+ 1)) / 2;
        return suma;
    }
    
}
