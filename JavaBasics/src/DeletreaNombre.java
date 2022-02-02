import java.util.Scanner;

public class DeletreaNombre {
	public static void main(String[] args) {
		
		/*Escribe un programa que pida al usuario ingresar su nombre y que 
		 * entonces imprima cada una de las letras de su nombre.

		Ejemplo: "Juan"
		"J"
		"u"
		"a"
		"n"*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe tu nombre por favor:");
		String name = sc.nextLine();
		
		for(int i= 0; i < name.length(); i++ ) {
			System.out.println(name.charAt(i));
			
		}
		
		
		

		
				
		
	}

}
