import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce tu nombre");
		
		String nombre = sc.nextLine();
		
		System.out.println("Introduce un n�mero");
		int n1 = sc.nextInt();
		
		sc.close();
		
		
		/*stem.out.println("Introduce otro n�mero");
		int n2 = sc.nextInt();
		
		System.out.println("N�mero 1:" + n1 + "N�mero 2" + n2);*/
		
		System.out.println("Tu nombre es: " + nombre + 
				". Tu numero es:" + n1);
		
		
	}

}
