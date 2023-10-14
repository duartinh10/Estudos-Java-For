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
public class DeverFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int i;
        int soma;
            soma = 0;
        int somanegativo;
            somanegativo = 0;
        for(i = 0 ; i < 4;i ++)
        {
            int numero;
                System.out.println("Digite um numero: ");
                numero = ler.nextInt();
        if(numero > 0)
        {
            soma += numero;
        }else
        {
            somanegativo ++;
        }
        }
        System.out.println("A soma dos numeros positivo é: "+soma);
        System.out.println("A soma dos numeros negativos: "+somanegativo);
        ler.close();
    }
    
}
