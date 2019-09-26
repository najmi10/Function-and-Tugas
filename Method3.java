/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method3;
import java.util.Scanner;

/**
 *
 * @author ica
 */
public class Method3 {
    public static void nilai(int d, int e, int f){
        if(d > e && d > f){
            System.out.println("Nilai terbesar adalah " + d);
        }else if (e >d && e > f){
            System.out.println("Nilai terbesar adalah " + e);
        }else if(f > d && f > e){
            System.out.println("Nilai terbesar adalah " + f);
        }
    }
     public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);
        System.out.print("Masukkan bilangan I = ");
        int i = caca.nextInt();
        System.out.print("Masukkan bilangan II = ");
        int c = caca.nextInt();
        System.out.print("Masukkan bilangan III = ");
        int a = caca.nextInt();
        nilai(i, c, a);
   
        
    }
   
    }
    

