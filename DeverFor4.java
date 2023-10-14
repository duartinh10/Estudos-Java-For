/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*Para uma turma de 45 alunos, construa um algoritmo que determine:
	a) A idade média dos alunos com menos de 1,70m de altura;
	b) A altura média dos alunos com mais de 20 anos.
*/
package DeverForOuPara;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class DeverFor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int i;
        int idade;
        int totalidade;
        totalidade = 0;
        int mediaidade = 0;
        float altura;
        float totalaltura;
        totalaltura = 0;
        float mediaaltura;
        mediaaltura = 0;
        int cont;
        cont = 0;
        int cont2;
        cont2 = 0;
            for(i = 0; i < 4; i++)
            {
                System.out.println("Digite a sua idade: ");
                    idade = ler.nextInt();
                        System.out.println("Digite a sua altura: ");
                            altura = ler.nextFloat();
                                if(altura <= 1.70)
                                {
                                    totalidade += idade;        
                                            cont = cont + 1;
                                                mediaidade = (totalidade/cont);
                                               
                                }
                                else if(idade >= 20)
                                {
                                    totalaltura += altura;
                                        cont2 = cont2 +1;
                                            mediaaltura = (totalaltura/cont2);
                                }
                              
            }
        System.out.printf("A media de idade de alunos com menos de 1,70 é: %d %n",mediaidade);
        System.out.printf("A media de altura dos alunos maiores de 20 anos é: %f %n",mediaaltura);
    }
    
}
