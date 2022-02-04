package metodos;

public class Metodos {
	//metodo es una función
	//atributos de una clase
	int a, b;
	
	//metodo void-(vacio), no devuelve nada
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de la suma es:" + a + "mas" + b + "es" + resultado);
		
		
		
	}
	//metodo con retorno de valores
		public int sumaConRetorno() {
			//int resultado = a + b;
			//return resultado;
			return a + b;
		}

		//argumentos
		//suma(argumentos)
		
		public double multiplicarConArgumentos(int arg1, double arg2) {
			int c = arg1;
			double d = arg2;
			return c * d;
			
		}
		
		//metodo estatico
		//estatico, void(no regresa datos) usa argumentos
		
		public static void imprimirNombre(String nombre) {
			System.out.println("Mi nombre es: " + nombre);
		}
		
}
