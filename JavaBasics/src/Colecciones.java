import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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
		
		/*LIST, cuenta con 2 implementaciones, se permiten elementos
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
		/*Es una lista doblemente enlazada,
		 * Es más rapido para insertar y remover elementos */
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("greymon");
		
		for(String digimon : digimones) {
			System.out.println(digimon);
			
		}
		System.out.println("*********");
		
		//MAP, asocia claves a valores, no contiene claves duplicadas.
		//Solo puede tener un valor asociado
		
		//HashMap
		//Tiene mejor rendimiento, pero no garantiza un orden
		//a la hora de hacer iteraciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Carlos Eduardo");
		usuarios.put(2, "Deny Flores");
		usuarios.put(3, "Rebeca Cuevas");
		//HashMap no acepta claves duplicadas
		
		System.out.println(usuarios.get(3));
		
		//keySet
		/*permite recuperar el nombre de la clave*/
		
		System.out.println(usuarios.keySet());
		
		
		//values
		/*nos permite recuperar el valor directamente, los ordena*/
		System.out.println(usuarios.values());
		
		//TreeMap
		Map<Integer, String> tamales = new TreeMap<Integer, String>();
		
		tamales.put(1, "Mole rojo");
		tamales.put(2, "Salsa verde");
		tamales.put(3, "Gansito");
		tamales.put(4, "Rajas");
		System.out.println("******************");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento ->{
		System.out.println(elemento.getKey().toString() + 
				elemento.getValue().toString());
		});
			
		//LinkedHashMap
		//guarda los elementos, segun el orden en que se inserten
		Map<Integer, String> Carros = new LinkedHashMap<Integer, String>();
		Carros.put(1, "Volvo");
		Carros.put(22, "Pointer");
		Carros.put(32, "Mustang");
		Carros.put(45, "Atos");
		
		System.out.println("**************");
		System.out.println(Carros.keySet());
		System.out.println(Carros.values());
		
		
				
		
		
		
		
		
		
		
		

		
		
	}

}
