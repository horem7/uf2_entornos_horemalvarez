package practica1;
import java.util.Scanner;

/**
 * Tenemos una clase llamada Notas con varios métodos dentro que nos darán opción a  ingresar notas, calcular su promedio y definir si es aprobado o no.
 * @author Horem Álvarez
 */
public class notas {
	
	//declaramos la variables que nos hacen falta
		double uni1, uni2, uni3;
		double acu1, acu2, acu3, def;
		//utilizamos Scanner para poder introducir datos
		Scanner entrada = new Scanner(System.in);
		
		///vamos ca crear un metodo para ingresar 
		
		/**
		 * Método IngresaNotas se pide al usuario que ingrese las notas del estudiante.
		 */
		public void IngresaNotas() {
			//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
			System.out.println("Introduce las notas del estudiante");
			
			System.out.print("A continuación nota 1: ");
			
			uni1= entrada.nextDouble();

			System.out.print("A continuación nota 2: ");
			
			uni2= entrada.nextDouble();
			System.out.print("A continuación 3: ");
			
			uni3= entrada.nextDouble();
			
		
		}
		
		/**
		 * Método Comprobacion aquí se comprueba si las notas ingresadas están dentro de los valores marcados.
		 */
		
		public void comprobarcion(){
			
			if (uni1>10) {
				System.out.println(" nota1 mal introducida");
				
			}else {
				System.out.println(" nota1 correcta");
			}
			
			if (uni2>10) {
				System.out.println(" nota2 mal introducida");
				
			}else {
				System.out.println(" nota2 correcta");
			}
			if (uni3>10) {
				System.out.println(" nota3 mal introducida");
				
			}else {
				System.out.println(" nota3 correcta");
			}
			
				
			
			
		}
		
		/**
		 * Método CalculoNotas calcula haciendo el  promedio de las notas ingresadas.
		 */
		
		public void Calculonotas() {
			acu1= uni1*0.35;
			acu2 = uni2 * 0.35;
			acu3 = uni3 * 0.30;
			
			def = acu1 + acu2+ acu3;
			
			//hasta aqui la tenemos calculada peor no la mostramos
		}
		
		/**
		 * Método Mostrar nos enseña las notas ingresadas y el promedio del cálculo de notas.
		 */
		public void Mostrar() {
			//print ln lo que hace es que al terminar el print baja la linea
			System.out.println(" notas introducidas son:");
			System.out.println(" nota1 = " + uni1);
			System.out.println(" nota2 = " + uni2);
			System.out.println(" nota3 = " + uni3);
			
			System.out.println(" acumuado 1 = "+ acu1);
			System.out.println(" acumuado 2 = "+ acu2);
			System.out.println(" acumuado 3 = "+ acu3);
			
			System.out.println(" nota definitiva es = "+ def);
			
		}
		
		/**
		 * Método Aprobado nos dirá si se ha aprobado o suspendido.
		 */

		public void aprobado() {
				
				if(def<5 && def>=0) {
					System.out.println("suspendio");
				}else {
					if (def>=5 && def<=10 ) {
					System.out.println("aprobado");
					}else {
						System.out.println(" error en la notas");
					}
				}
			}

	public static void main(String[] args) {
		
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
				notas fc= new notas();
				
				fc.IngresaNotas();
				
				fc.comprobarcion();
				

				fc.Calculonotas();
				
				fc.Mostrar();
				
				fc.aprobado();
				
			}

		}


