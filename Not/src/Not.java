
public class Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nota= "C";
		
		switch (nota) {
		case "A":
			System.out.println("Excelente");
			break;
		case "B":
		case "C":
			System.out.println("Bien hecho!");
			break;
		case "D":
 		    System.out.println("Con las justas");
 		    break;
		case "F":
			System.out.println("Intenta otra vez");
			break;
		default:
			System.out.println("Nota inválida");
		}
		
		System.out.println("Su calificación es "+nota );
		
	}

}
