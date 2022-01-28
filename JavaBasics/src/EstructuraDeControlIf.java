import java.util.Scanner;

public class EstructuraDeControlIf {
	
	public static void main(String[] args) {
		//estructuras de control de flujo
		//nos sirve para la toma de decisiones
		
		//Las estructuras de control de flujo nos sirven para
		//cambiar el flujo de nuestro programa, esto
		//lo hace evaluando una condicion y a partir
		//de la evalucacion se realiza una accion u 
		//otra.
		
		/*if, dentro se evalua una condicion y depende el
		 * resultado se ejecuta una accion 
		 */
		/*if(condicion) {
			codigo
		}else {
			codigo
		}
		*/
		//es una clase de salida, ya predeterminada
		System.out.println("Introduce tu edad:");
		
		//ets clase pide inf al usuario
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		
		if(edad <=18) {
			System.out.println("Eres mayor de edad");
			}
		else {
			System.out.println("Eres menor de edad");
		}
		
		
		
	}


}
