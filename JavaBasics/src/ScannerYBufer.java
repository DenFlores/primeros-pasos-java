import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce tu nombre");
		
		String nombre = sc.nextLine();
		
		System.out.println("Introduce un número");
		int n1 = sc.nextInt();
		
		sc.close();
		
		
		/*stem.out.println("Introduce otro número");
		int n2 = sc.nextInt();
		
		System.out.println("Número 1:" + n1 + "Número 2" + n2);*/
		
		System.out.println("Tu nombre es: " + nombre + 
				". Tu numero es:" + n1);
		
		
	}

}
