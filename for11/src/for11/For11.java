/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for11;
import java.util.Scanner;
/**
 *
 * @author wildan
 */
public class For11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan bilangan");
        int x = s.nextInt();
        for (int i = 1; i <= x; i++) {
            if(i%2==1){
            
                System.out.println(""+i);
            }
        }
    }
    
}
