package Laura;

public class Laura {

	public static String nombreLaura() {
		String nombre = "Laura";
		return nombre;
	}
	public static void misHobbies() {
		System.out.println("Y mis hobbies son los shooter, ser entrenadora de baloncesto y árbitro");
	}
	
	public static void misComidas() {
		System.out.println("mis comidas favs son los macarrones con tomate, la tortilla de patata y las hamburguesas");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hola soy " + nombreLaura());
		misHobbies();
		misComidas();
	}

}
