package primero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mayor {
	final static int cantidadComparacion=10;
	public static void main(String[] args) {
		int valor=obtenerenterovalido();
		int mayor=valor;
		
		for (int i=0; i<cantidadComparacion; i++){
			valor=obtenerenterovalido();
			mayor=obtenerMaximo(mayor,valor);
			System.out.println("El mayor ingresado es: " + mayor);
		}
	}

	private static int obtenerMaximo(int a, int b) {
		// TODO Auto-generated method stub
		if (a>b)
			return (a);
		else
			return (b);
	}

	private static int obtenerenterovalido() {
		// TODO Auto-generated method stub
		int valor=0;
	
		boolean valorvalido=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		while (!valorvalido){
			try{
				System.out.println("Ingrese un numero");
				valor=new Integer (entrada.readLine());
				valorvalido=true;
			}
			catch (Exception exc){
				System.out.println("ingresame un numero");
				valorvalido=false;
			}
		}	
		return valor;
	}
	
	

}
