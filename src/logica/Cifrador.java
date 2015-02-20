package logica;

public class Cifrador extends Traductor {

	public static String cifrarVigenere (String texto, String clave){	
		
		texto = quitarEspacio(texto);
		texto = aMayusculas(texto);
		clave = quitarEspacio(clave);
		clave = aMayusculas(clave);
		
		String mensajeCifrado = new String (aCadena(suma(aNumero(texto), aNumero(clave), SUMA)));
		
		return mensajeCifrado;
	}
	
}
