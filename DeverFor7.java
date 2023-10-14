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
public class DeverFor7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int i;
        int funcionario;
        int salario;
        int salarioalto;
        salarioalto = 0;
        int salnovo;
        salnovo = 0;
        int salariomenor;
        //salariomenor = 10000;
        int salnovo2;
        salnovo2 = 0;
        int totalsalario;
        totalsalario = 0;
        int media;
        int cont;
        cont = 0;
        String nome;
            System.out.println("Digite a quandidade de funcionarios");
                funcionario = ler.nextInt();
                    System.out.println("Digite o Menor salario possivel: ");
                        salariomenor = ler.nextInt();
        for(i = 0; i < funcionario; i ++)
        {
            System.out.println("Digite o seu nome: ");
                nome = ler.next();
                    System.out.println("Digite o seu salario: ");
                        salario = ler.nextInt();
                                salnovo = salario;
                                salnovo2 = salario;

                                        if(salarioalto < salnovo)
                                        {
                                            salarioalto = salario;
                                        }
                                        if(salariomenor > salnovo2 | salariomenor < 2000)
                                        {
                                            salariomenor = salario;
                                        }
                                        cont = cont + 1;
                                        totalsalario = totalsalario + salario;                                       
        }
        media =  totalsalario/cont;
        System.out.printf("A media de salario é %d %n",media);
        System.out.printf("O maior salario é %d %n",salarioalto);
        System.out.printf("O menor salario é %d %n",salariomenor);
    }
    
}
