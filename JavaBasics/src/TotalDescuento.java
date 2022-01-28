import java.util.Scanner;

public class TotalDescuento {
	public static void main(String[] args) {
		// si la cuenta es de menos de 1000
				// sila cuenta es de 1000 - 4999 10%
				// si la cuenta es de 5000 a 9999 20%
				// si la copra es de 10000 o más 30%

		
	System.out.println("Ingresa el total de tu cuenta:");
	Scanner scanner = new Scanner(System.in);
	float cantidad = scanner.nextInt();
	
	
	if(cantidad < 1000) {
		System.out.println("Lo sentimos, tu cuenta no tiene descuento.");
		}
	
	else if(cantidad <5000 ) {
		
			System.out.println("Tu precio final es de:" + ((cantidad) - (cantidad * 10)/100));
			
		
		
		
	}
	else if(cantidad < 9999 ) {
		
			System.out.println("Tu precio final es de:" + ((cantidad) - (cantidad * 20)/100));
			
		
		
		
	}
	else if(cantidad >= 10000 ) {
	
			System.out.println("Tu precio final es de:" + ((cantidad) - (cantidad * 30)/100));
			
		
		
		
	}
	}

}
