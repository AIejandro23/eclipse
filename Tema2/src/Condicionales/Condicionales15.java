package Condicionales;
import java.util.Scanner;
public class Condicionales15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*
		 * Programa que pregunte el numero de mes y devuelva el 
		 * nombre de ese mes
		 */
		System.out.println("Introduce el numero de un mes (1-12) ");
		int mes = entrada.nextInt();
		
		switch(mes){
		case 1:
			System.out.println("ENERO");
			break;
		case 2:
			System.out.println("FEBRERO");
			break;
		case 3:
			System.out.println("MARZO");
			break;
		case 4:
			System.out.println("ABRIL");
			break;
		case 5:
			System.out.println("MAYO");
			break;
		case 6:
			System.out.println("JUNIO");
			break;
		case 7:
			System.out.println("JULIO");
			break;
		case 8:
			System.out.println("AGOSTO");
			break;
		case 9:
			System.out.println("SEPTIEMBRE");
			break;
		case 10:
			System.out.println("OCTUBRE");
			break;
		case 11:
			System.out.println("NOVIEMBRE");
			break;
		case 12:
			System.out.println("DICIEMBRE");
			break;
		default:
			System.out.println("Numero no valido");
			
		
		
	}
	}	

}
