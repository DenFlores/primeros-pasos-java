
public class Ciclos {
	public static void main(String[] args) {
		//while, mientras qe pase haras algo
		
		/*int control = 0;
		
		while(control < 10 ) {
			System.out.println("Control =" + control);
			control++;
		}*/
		
		
		//do while, haces y condicionas
		
		/*int control = 3;
		
		do { 
			//codigo a ejecutar
			System.out.println("Control =" + control);
			//modificador de variable control 
			control++;
		}while(control < 3); */
		/*for (int i=0; i < 3; i++ ) {
			System.out.println("Control =" + i);
			
		}*/
		
		for(int i=0;i < 10; i++) {
			if(i % 2 ==0) { //solo se ejecuta cuando el valor de i sea numero par
               continue;//permite saltarnos una ejecucion del ciclo
               //deja que continue el ciclo
			}
			System.out.println("Control =" + i);

			}
		for(int i=0; i < 3; i++) {
			System.out.println("Control2 =" + i);
			continue;
		}
		 }
}

