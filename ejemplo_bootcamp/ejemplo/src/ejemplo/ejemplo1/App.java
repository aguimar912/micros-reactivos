package ejemplo.ejemplo1;

public class App {

	public static void gato() {
		MiInterfazFuncional miGato= (String param) -> {
			
			return param;
		};
		
		System.out.println(miGato.doSomething("miau"));
	}
	
	public static void main(String[] args) {
		var miPerro= new Perro();
		
		gato();
		System.out.println(miPerro.doSomething("guau"));

	}

}
