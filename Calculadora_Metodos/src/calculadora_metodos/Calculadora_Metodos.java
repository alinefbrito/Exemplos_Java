/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_metodos;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class Calculadora_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner eStr = new Scanner(System.in);
        Scanner eNum = new Scanner(System.in);
        
        System.out.println("Digite o prim num");
        double x = eNum.nextDouble();
        System.out.println("Digite a operação");
        String s = eStr.nextLine();
        System.out.println("Digite o seg num");
        double y = eNum.nextDouble();
        
        char op = s.charAt(0);
        
        switch (op) {            
            case '+':
                System.out.println("valor = " + Soma(x, y));
                break;
            
            case '-':
                Subtracao(x, y);
                break;
            
            case '*':
                Multiplicacao(x, y);
                break;
            
            case '/':
                Divisao(x, y);
                break;
            
            default:
                Resposta();
            
        }        
    }
    
    public static double Soma(double a, double b)//variaveis são os parametros do método
    {//cria c
        double c = a + b;
        //devolve c
        return c;
    }

    //metodo sem retorno: void
    public static void Subtracao(double x, double y) {
        double resultado = x - y;
        System.out.println("valor = " + resultado);
    }
    
    public static void Multiplicacao(double x, double y) {
        double resultado = x - y;
        System.out.println("valor = " + resultado);
    }

    public static void Divisao(double x, double y) {
        double resultado = x - y;
        System.out.println("valor = " + resultado);
    }

    public static void Resposta()//não é obrigatório ter parametros
    {
        System.out.println("Operador inválido");
    }
}
