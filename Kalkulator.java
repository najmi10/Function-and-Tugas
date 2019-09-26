/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author ica
 */
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("===K A L K U L A T O R  S E D E R H A N A===");
        System.out.println();
        System.out.println("Penjumlahan: " + penjumlahan(20 , 15));
        System.out.println();
        System.out.println("Pengurangan: " + pengurangan(30 , 22));
        System.out.println();
        System.out.println("Perkalian: " + perkalian(50 , 25));
        System.out.println();
        System.out.println("Pembagian: " + pembagian(25 , 4));
        System.out.println();
        System.out.println("Sisa hasil bagi: " + sisabagi(4 , 5));
        System.out.println();
    }
    public static int penjumlahan(int bil1,int bil2){
        bil1 = 20;
        bil2 = 15;        
        int hasil = bil1+bil2;
        return hasil;
    }
    public static int pengurangan(int bil1, int bil2){
        bil1 = 30;
        bil2= 22;
        int hasil = bil1-bil2;
        return hasil;
    }
    public static int perkalian(int bil1, int bil2){
        bil1 = 50;
        bil2 = 25;
        int hasil = bil1*bil2;
        return hasil;
    }
    public static double pembagian(double bil1,double bil2){
        double hasil = bil1/bil2;
        return hasil;
    }
    public static double sisabagi(double bil1, double bil2){
        bil1 = 4;
        bil2 = 5;
        double hasil = 0;
        
        if(bil1>bil2){
            System.out.println("Sisa hasil bagi = " +(bil1%bil2));
        }else if(bil1<bil2){
            System.out.println("Tidak ada hasil");
        }
            return hasil;
        
        }
}
    

