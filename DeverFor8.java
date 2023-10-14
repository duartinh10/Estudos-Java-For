/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DeverForOuPara;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class DeverFor8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int i;
        int num;
        int maiornumero;
        maiornumero = 0;
        int menornumero;
        menornumero = 100;
        int cont;
        cont = 0;
        int numinicial;
        numinicial = 0;
        int media;
        for(i = 0; i < 4; i++)
        {
            System.out.println("Digite um numero: ");
                num = ler.nextInt();
                    if(num > 0)
                    {
                        cont += 1;
                            numinicial = numinicial + num;
                    }
                    if(maiornumero < num)
                    {
                        maiornumero = num;
                    }
                    if(menornumero > num)
                    {
                        menornumero = num;
                    }
        }
        media = numinicial/cont;
            System.out.printf("A media é: %d %n",media);
            System.out.printf("O maior numero é %d %n",maiornumero);
            System.out.printf("O maior numero é %d %n",menornumero);
    }
    
}
