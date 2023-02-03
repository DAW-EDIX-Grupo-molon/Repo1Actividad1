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
	
	private static String comidas() {
		String comidas = "Paella, arroz al horno y coca de tomate";
		return comidas;
	}//END misComidas
	
	public static void main(String[] args) {
		
		System.out.println("Hola, soy "+miNombre());
		System.out.println("y tres de mis hobbies son: " + hobbies());
		System.out.println("Mis 3 comidas favoritas son: " + comidas());		
		System.out.println("Mi postre favorito es la tarta de queso");
		
	}//END MAIN

}//END IVAN
