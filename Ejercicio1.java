import java.util.*;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		
	int numero;
	int numeros;

	System.out.println("ingrese un numero");
	numero = read.nextInt();


	for (int i = 0; i<numero ;i++ ) {
		numeros = (int)(Math.random()*100);
		if (numeros%2==0) {
			System.out.println("numero generado "+numeros+" es par");

		}else{
			System.out.println("numero generado "+numeros+" no es par");

		}
		
	}

	}

}



	