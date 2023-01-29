package ivan;

public class Ivan {
	
	private static String miNombre() {
		
		String miNombre = "Iván";
	
		return miNombre;
	
	}//END MINOMBRE
	
	private static String hobbies() {
		String hobbies = "deporte, música y videojuegos";
		return hobbies;
		
		
		
	}//END hobbies

	public static void main(String[] args) {
		
		System.out.println("Hola, soy "+miNombre());
		System.out.println("y tres de mis hobbies son: " + hobbies());

	}//END MAIN

}//END IVAN
