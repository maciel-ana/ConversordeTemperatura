package pct;
import java.util.Scanner;

public class ConversorGraus {
  public static void main(String[] args) {
	  
	  	// Declaração de variáveis 
	  	double c,f,total1,total2, total3;
	  
	  // Criação e instancia do objeto de entrada
	  	Scanner input = new Scanner(System.in);
	
	  	//Apresentação 
	  	System.out.println("\n\t\t\t-- Coversor de Celcius para Fahrenheit--\n");
	      //Gustavo
	  	//Entrada
	  	System.out.print("Informe c:");
	  	c = input.nextDouble();
	 
	  
	  	//Processamento
	     total1 = 9*c /5 + 32;
			  
	     // Saída	
		System.out.println("Conversão =  "+ total1 );	
			//Ana Clara
		//Conversor de F para C
		System.out.println("\n\t\t\t -- Conversor de F para C --\n");
		
		//Entradas	
		System.out.print("Informe os Fahrenheit: ");
		f = input.nextDouble();
		
		// Processamento
		total2 = f - 32;
		total3 = total2 / 9 * 5;
		
		//Saída 
		System.out.println("Conversão =" + total2);
		 
  }
}