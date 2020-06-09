/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somatorio_repeticao;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class Somatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor");
        int cont = leitor.nextInt();
        int soma=0;
        System.out.println("Soma 1 ate 1000");
        for(int i=1;i<=cont; i++ )
        {
            soma += i;
            //soma = soma+i;
             System.out.println(i +"- " +soma);
        }
        int soma3 = 0;
        System.out.println("Soma 1 ate 100 não multiplo 3");
        for(int i=cont;i>0; i-- )
        {
            if (i%3!=0)
                soma3+=i;
            System.out.println(i +"- " +soma3);
        }
    }
}
