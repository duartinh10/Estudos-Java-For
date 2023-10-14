/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DeverForOuPara;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class DeverFor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int i;
        int numero;
        int produto;
            System.out.println("Digite um numero: ");
               numero = ler.nextInt();
            for(i = 0; i < 14; i++)
            {
                       produto = numero * i;
                            System.out.printf(" O produto de %d x %d = %d %n",i,numero,produto);
            }
    }
    
}
