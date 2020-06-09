/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner eStr = new Scanner(System.in);
       Scanner eNum = new Scanner(System.in);
       
       
       System.out.println ("Digite o prim num");
       double x = eNum.nextDouble();
       System.out.println ("Digite a operação");
       String s = eStr.nextLine();
       System.out.println ("Digite o seg num");
       double y = eNum.nextDouble();
       
       char op = s.charAt(0);
       
       switch (op)
       { 
       		case '+': System.out.println ("valor = " +(x+y));
       			break;
       			
       		case '-': System.out.println ("valor = " +(x-y));
       			break;
       			
       		case '*': System.out.println ("valor = " +(x*y));
       			break;
       			
       		case '/': System.out.println ("valor = " +(x/y));
       			break;
       			
       		default: System.out.println ("Operador inválido: " +op);
       		   
       	
       	}  
    }
    
}