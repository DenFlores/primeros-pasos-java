import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		/*
		   * Pedir al usuario 2 n�meros por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) Divisi�n
		   * 4) Multiplicaci�n
		   * 
		   * y despues imprimir el resultado
		   */
		
		System.out.println("Introduce 2 n�meros a operar:");
		Scanner sc = new Scanner (System.in);
		
		float numero1 = sc.nextInt();
		float numero2 = sc.nextInt();
		
		System.out.println("Elige la operaci�n a realizar: \n Suma, Resta, Multipliaci�n, Divisi�n");
		String operacion = sc.nextLine();
		
		switch (operacion){
		case "suma":
			System.out.println("La suma es:" + (numero1 + numero2));
			break;
		case "resta":
			System.out.println("La suma es:" +  (numero1 - numero2));
			break;
		case "multiplicacion":
			System.out.println("La suma es:" + (numero1 * numero2));
			break;
		case "division":
			System.out.println("La suma es:" + (numero1 / numero2));
			break;
		default:
			System.out.println("Operaci�n invalida");
		
		}
		

	

}
}
