
public class Arreglos {
	public static void main(String[] args) {
		
	
	/*Solo almacenan un tipo de dato
	Se tiene que especificar el tamaño o la cantidad de elementos
	que va a contener
	*/
	//manera 1
	int numeros[]; //creamos la variable	
	numeros = new int [4];//creamos el arreglo
	
	//manera2
	//[ se pueden poner antes o despues del nombre del array
	String[] nombres = new String [4];//basado en 0, [0, 1, 2, 3]
	
	//manera3 array literal
	String []nombresFrutas = new String[]{"Manzana", "Uvas", "Platanos", "Naranjas"};
	//se le asignan valores y posiciones al array
	numeros[0] = 10;
	numeros[1] = 8;
	numeros[2] = 7;
	numeros[3] = 9;
	
	nombres[0] = "Juan";
	nombres[1] = "Pedro";
	nombres[2] = "Jose";
	nombres[3] = "Julian";
	
	//llamamos al array
	System.out.println(numeros[3]);
	System.out.println(numeros[1]);
	System.out.println(numeros);
	
	
	for(int i=0;i < numeros.length; i++) {
	System.out.println("Elemento de numeros" + numeros[i]);
	System.out.println("Elemento de nombres" + nombres[i]);
	System.out.println("Elemento de frutas" + nombresFrutas[i]);
	System.out.println("--------");


	}
	}
}
