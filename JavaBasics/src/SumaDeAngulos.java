import java.util.Scanner;

public class SumaDeAngulos {
	public static void main(String[] args) {
		
		System.out.println("Introduce el valor de los ángulos:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int suma = a + b +c;
		int d = 180;
		
		if(suma == d ) {
			System.out.println("La suma de los ángulos es de:" + (d));
			
			
		}
		else{
			System.out.println("La suma de los angulos no forman un triángulo");
		}
			
		
		
		
		
		
	}

}
