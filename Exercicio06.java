//6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
//A fórmula de conversão é C=(F-32) *(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 

import java.util.Scanner;

public class Exercicio06 {

	public static void main (String[] args) {
		
	Scanner input = new Scanner(System.in);
		        
	System.out.print("Digite o valor em Fahrenheit que deseja converter = ");

	double F = input.nextDouble();
			 
	double C =  ( F - 32.0 ) * ( 5.0 / 9.0 );
			        
	System.out.printf ( "Equivale a " + C + "Celsius");

		}
		}

