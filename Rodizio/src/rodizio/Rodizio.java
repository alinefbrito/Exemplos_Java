/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodizio;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class Rodizio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
    	
    	System.out.println ("Digite apenas os números da placa do seu carro" );
    	int placa = entrada.nextInt();
    	int digito = placa%10;
    	
    	switch (digito)
    	{
    		case 1:System.out.println ("Segunda feira" );
       			break;
       			
       		case 2:System.out.println ("Segunda feira" );
       			break;
       			
       		case 3:System.out.println ("Terça feira" );
       			break;
       			
       		case 4:System.out.println ("Terça feira" );
       			break;
    		
    		case 5:System.out.println ("Quarta feira" );
       			break;
       			
       		case 6:System.out.println ("Quarta feira" );
       			break;
    		
    		case 7:System.out.println ("Quinta feira" );
       			break;
       			
       		case 8:System.out.println ("Quinta feira" );
       			break;
       			
       		case 9:System.out.println ("Sexta feira" );
       			break;
       			
       		case 0:System.out.println ("Sexta feira" );
       			break;
    		} 
    	
    	
    }
    
}
