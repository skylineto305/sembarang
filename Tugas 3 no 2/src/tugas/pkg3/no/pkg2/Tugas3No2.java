/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg3.no.pkg2;
import java.util.Scanner;
/**
 *
 * @author wildan
 */
public class Tugas3No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        System.out.println("Segitiga Angka");
        System.out.println("Masukkan Bilangan");
        int n = s.nextInt();
        for (int i = 1; i<= n; i++) {
            for (int j = 1; j<=i; j++){
            System.out.print(j+"");
          }
            System.out.println("");
        
    }
}
}
