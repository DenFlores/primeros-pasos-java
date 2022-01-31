import java.util.Scanner;

public class EstructuraDeControlSwitch {
	public static void main(String[] args) {
		//Estructuras de control nos sirve para controlar el flujo de
		//comportamiento de un programa, para la toma de
		//decisiones
		
		/*switch(condicion a evaluar){
		 * case "valor" : 
		 * //codigo a ejecutar
		 *  // break;
		 * case "n":
		 * // codigo a ejecutar
		 *  //break;
		 *  default
		 *   //codigo a ejecutar
		 }
		 * */
		//Solicitar al usuario un dia a la semana y mostrar
		//un mensaje
		System.out.println("Introduzca un día de la semana:");

		Scanner sc = new Scanner (System.in);
	
		String dia = sc.nextLine();
		//Si queremos obtener textos, se utiliza nextLine.
		
		switch(dia.toLowerCase()) {
		    case "lunes":
		         System.out.println("Lunes casi Viernes, ánimo!");
		         break;
		    case "martes":
		    	System.out.println("Un día más :)");
		    	break;   	
		    case "miercoles":
		    System.out.println("Miercoles pero a que costo");
		        break;
		    case "jueves":
		    System.out.println("Ya es Jueveees");
		        break;
		    case "viernes":
		    System.out.println("Bueno, a mimir... Zz!");
		        break;
		    case "sabado":
			System.out.println("NO MÁS TRABAJACIÓN");
			    break;
		    case "domingo":
		    System.out.println("Dormingooo!");
		    break;
    
		    default:
		    	System.out.println("Palabra desconocida");
		        
		}
		    
		         
	
	         
	    
	}
	
	}
