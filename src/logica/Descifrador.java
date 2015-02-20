package logica;

public class Descifrador extends Traductor {

	public static String descifrarVigenere(String texto, String clave){

		texto = quitarEspacio(texto);
		texto = aMayusculas(texto);
		clave = quitarEspacio(clave);
		clave = aMayusculas(clave);
		
		String mensajeDescifrado = new String (aCadena(suma(aNumero(texto), aNumero(clave), RESTA)));
	
		return mensajeDescifrado;
		
	}
	
}
