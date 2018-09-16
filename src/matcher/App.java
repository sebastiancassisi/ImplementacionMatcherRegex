package matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	//Comprueba si existe y donde se encuentra, una palabra en un texto
	public static void main(String[] args) {
		String texto = "todos Hola a todos mis amigos todos";
		//CASE_INSENSITIVE no tiene encuenta mayusculas o minusculas
		Pattern p = Pattern.compile("todos", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(texto);
		
		System.out.println("Matches= "+m.matches());
		

		int contador=0;
		while (m.find()) {
			 contador++;
			 System.out.println("coincidencia nro= "+contador+" Start= "+m.start()+" End= "+m.end());
			
		}		
	}

}
