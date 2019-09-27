/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat1method;
import java.util.Scanner;

/**
 *
 * @author ica
 */
public class Lat1Method {
    public static void hitung(int a, int b)
    {
        System.out.println("Hasil: " +(a+b));
    }
    
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan I: ");
        int bil1= baca.nextInt();
        
        System.out.print("Masukkan bilangan II: ");
        int bil2 = baca.nextInt();
        
        hitung(bil1, bil2);
    
        
    }
    
}
