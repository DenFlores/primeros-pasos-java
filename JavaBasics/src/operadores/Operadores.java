package operadores;
import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//operadores Aritméticos
		// +, -, /, *, %
		
		int a = 10;
		int b = 20;
		double c = 10.5;
		
		int suma = a + b;
		
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es:";
		System.out.println(str1 + suma);
		
		//resta
		System.out.println("El resultado de la resta es:" + (b - a));
		
		//division
		int division = a / b;
		System.out.println("El resultado de la división es:" + (division));
		
		//double division2 = (double)a/b;
		double division2 = c / b;
		//por lo menos uno de los datos debe ser de tipo double
		//java lo interpreta como 10.0 y por eso puede dar 0.5 
		System.out.println("El resultado de la división es:" + (division2));
		
		//multiplicacion 
		double multiplicacion = c * a;
		System.out.println("El resultado de la división es " + multiplicacion);
		
		//modulo
		int modulo = a % b;
		System.out.println("El modulo de la operación es:" + modulo);
		
		/*Operador de asignación =, */
		
		int d = 5, e; // inicializar variables vacias
		e = 6;
		System.out.println(d + " - " + e);
		
		//operadores de declaración compuesta
		//+=, -=, *=, /=, %=, nos permite hacer una operacion simplificada
		
		int f = 0, g = 5;
		f += 5;
		
		System.out.println(f);
		
		//operadores relacionales
		/* <, >, <=, >=
		 * == igualdad 
		 * != diferencia
		 * Nos daran un resultado de tipo booleano*/
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i); 
		System.out.println(i != h); 
		//System.out.println(h != j);// son valores distintos y no se pueden comparar
		
		//operador unario
		/* ++, --
		 * preasignacion -- ++ se le asigna un valor antes de usarse
		 * postasignacion -- k++ primero lee el valor y despues le suma 1
		 * */
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//presedencia de operadores
		
		int operacion = 4 + 5 * 6 / 3;
		//6 * 6 = 30
		//30 / 3 = 10
		//4 + 10 = 14
		//la multiplicacion tiene la presedencia mayor
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);//
	
		//Operador ternario
		int edad = 18;
		//el ? es una pregunta, dice que si lo del parentesis es cierto o falso y muestra 0 porque es verdad ":" es un or
		//int resultado = (edad <= 18)? valor1 : valor2;
		int valor = (edad<=18) ? 2:1;
		
		//System.out.println(resultado);
		
		//Operadores lógicos
		// adn - &&
		// or - ||
		// Not !
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);//true
		System.out.println(true && !false);//true
		
		//scanner recoge datos de entrada por parte del usuario
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int num = sc.nextInt();
		System.out.println(num);
		
		
	}
	
	

}
