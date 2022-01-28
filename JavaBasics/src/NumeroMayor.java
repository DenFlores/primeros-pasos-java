import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */
System.out.println("Introduce 3 numeros:");
		
/*1 4 4
4 1 4
4 4 1
5 4 4  4 5 4
4 4 5 5 5 5*/
		//esta clase pide inf al usuario
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int numero3 = scanner.nextInt();
		
		
		if(numero1 < numero2){
			if(numero2 < numero3) {
				System.out.println("El número mayor es:" + (numero3));
				}
			}
		else if(numero2 < numero3) {
			if(numero3 < numero1) {
				System.out.println("El número mayor es:" + (numero1));
				
			}
			
		}
		else if(numero3 < numero2) {
			if(numero2 < numero1) {
				System.out.println("El numero mayor es}:" + (numero1));
				
			}
		}
		else if(numero3 < numero1) {
			if(numero1 < numero2) {
				System.out.println("El número mayor es:" + (numero2));
				
			}
		}
		else if(numero1 < numero3) {
			if(numero3 < numero2) {
				System.out.println("El número mayor es:" + (numero2));
			}
		}
		


		
		

	}

}
