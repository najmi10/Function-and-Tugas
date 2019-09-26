/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method2;
import java.util.Scanner;
/**
 *
 * @author ica
 */
public class Method2 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        int jarak,waktu;
        int kecepatan;
        
        System.out.println("Jarak(km): ");
        jarak = baca.nextInt();
        
        System.out.println("Waktu tempuh(jam): ");
        waktu = baca.nextInt();
        kecepatan = jarak/waktu;
        
        System.out.println("Kecepatan: " + kecepatan + "km/jam");  
    
        
       
        
        
        
    }
    
}
