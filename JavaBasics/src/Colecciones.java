import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Colecciones {
	public static void main(String[] args) {
		/*las colecciones nos sirven para almacenar un conjunto de objetos
	    *La diferencia de las colecciones y los objetos es
		 * que las colecciones son dinamicas, pueden cambiar el
		 * numero de objetos agregados*/
		 
		
		//Set tiene 3 implementaciones, no puede contener elementos repetidos
		
		//HashSet -Los elementos no mantienen un orden
		
		//<> especifica el tipo de datos que se utilizaran
		/*Set<String> frutas = new HashSet<String>();
		//add agrega elementos a la coleccion
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		frutas.add("mango");


		//necesita un elemento donde se guardara, 'fruta', cada que lo recorre
		//utiliza un elemento de la coleccion, dice, recorre la coleccion
		//'frutas'
		
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		for(String fruta : frutas) {
			System.out.println(fruta);
		}*/
		//TreeSet
		/*Esta implementacion ordena los elementos en funcion a sus valores.*/
		/*Set<String> frutas = new TreeSet<String>();
		
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		frutas.add("mango");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}*/

		//LinkedHashSet
		/*Ordena los elementos en orden de insersion, es mas 
		 * costoso de HashSet
		 */
/*Set<String> frutas = new LinkedHashSet<String>();
		
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		frutas.add("mango");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		/*List, cuenta con 2 implementaciones, se permiten elementos
		 * duplicados, accede a elementos especificos, busca elementos
		 */
		//ArrayList
		List<String> pokemones = new ArrayList<String>();
		//Se hacen importaciones de List y ArrayList
		
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("odishh");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		pokemones.add(2, "pikachu");
		
		//remove, remueve el elemento de la posición especificada
		pokemones.remove(3);
		
		//set va a remplazar el elemento en la posicion especificada 
		pokemones.set(0, "Flareon");
		//aqui se dice que agregue pikachu en la poscision 2
		/*add si agregamos un indice y un elemento, posiciona el elemento en el indice
		 * y realiza un desplazamiento, es decir, no borra el elemento
		 * solo lo desplaza
		 */
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
			
		}
		
		System.out.println("**********");
		System.out.println(pokemones.get(3));
		//get, get devuelve el elemento que se encuentre en la posición que pongas dentro de los ( )

		/*CharAt, se utiliza en Strings
		 *  te da el caracter especifico dentro de la cadena,
		 * de la posicion que tu le des, "Hola", H es la 0, o es la 1 y así
		 * sucesivamente
		 */
		
		
	//indexOf, nos va a devolver la posicion del elemento, y si 
		//el elemento no se encuentra nos devuelve -1, manda el primero que encuentre
		
		System.out.println(pokemones.indexOf("Gengar"));
		
		//lastIndexOf, devuelve el ultimo elemento
		//System.out.println(pokemones.lastIndexOf("Gengar"));
		System.out.println("**********");
		
		
		
		
		
		
		
		
		
		
		
		//LinkedList
		
		
		
		
	}

}
