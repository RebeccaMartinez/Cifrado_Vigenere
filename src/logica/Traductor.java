package logica;

public class Traductor {

	protected static final int SUMA = 1;
	protected static final int RESTA = (-1);

	
	public static String quitarEspacio(String texto){
		texto = texto.replace(" ",""); //Quitamos espacios, retornos y tabuladores
		return texto;
	}
	
	public static String aMayusculas(String texto){
		texto = texto.toUpperCase();
		return texto;
	}
	
	public static int[] aNumero(String texto){
		int x = 65; //A en código ascii
		int z = texto.length();
		int [] respuesta = new int [z];
		for (int i = 0; i < texto.length(); i++){
				respuesta[i] = ((int) texto.charAt(i)) - x;
		}

		return respuesta;
	}
	
	public static String aCadena(int [] texto){
		int x = 65; //A en ascii
		char m;
		String cadena = new String (""); 
		for (int i =0; i<texto.length; i++){
				
				m = (char) (texto[i] + x);
				cadena = cadena + m;
		}
		return cadena;
		
	}
	
	public static int [] suma(int [] texto, int [] clave, int suma){
		
		int [] aux = new int [texto.length];
		for (int i = 0; i < texto.length; i++){
			aux[i] = (texto[i] + suma*clave[i % clave.length])%26; //sumamos y hacemos el modulo de 26 para que den numeros entre 0 y 26
			if(aux[i]<0){
				aux[i] = aux[i] + 26;
			}
		}
		
		//modificacion: aux[i] = (clave[i%clave.length] - texto[i])%26
		
		
		return aux;
	}

}
 