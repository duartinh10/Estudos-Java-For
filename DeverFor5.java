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
public class DeverFor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int i;
        int numero1;
        int produto;
        produto = 1;
        for(i = 0; i < 5; i++)
        {
            System.out.println("Digite um numero: ");
            numero1 = ler.nextInt();
                if(numero1 % 2 == 0)
                {
                    System.out.println("");
                }else
                {
                    produto = produto * numero1;
                }
        }
        System.out.printf("O produto dos numero primos é %d ",produto);
    }
    
}
