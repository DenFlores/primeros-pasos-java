import java.util.Scanner;
public class Tablas {
	//Utilizando un bucle while
			    public static void main(String[] args)
			    {
			        Scanner console = new Scanner(System.in);
			        int num;
			        
			        System.out.print("Ingresa cualquier número positivo: ");
			        num = console.nextInt();
			                
			        System.out.println("Tabla de multiplicar de  " + num);
			        
			        int control = 1;
					
					while(control <= 10 ) {
						System.out.println(num * control);
					control++;
			        
            	    //1.- Crea una nueva clase llamada Tabla
					//2.- Copia  el siguiente codigo y verifica que funcione
							//3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
			       //Implementa un bucle while que imprima el resultado
			    }
			}	
}




