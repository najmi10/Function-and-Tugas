/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method1;

/**
 *
 * @author ica
 */
public class Method1 {

    public static int hitung(int a, int b) 
        {
        int c = a + b;
        return c;
        }
    
    public static void main(String[] args)
    {
        int x;
        int bil = 23, bil2 = 65;
        
        x = hitung(bil,bil2);
        System.out.println("Hasil : " + x);
    }
}
