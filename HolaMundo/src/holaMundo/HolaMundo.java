package holaMundo;

public class HolaMundo {

	public HolaMundo() {
		// TODO Auto-generated constructor stub
	}
	
	public void holaMundo() {
		System.out.println( "Hola mundo" );
	}
	
	
	public boolean pegarADavid(boolean si) {
		return si;
	}
	
	public void david() {
		System.out.println("El m�todo PRO");
	}
	
	public boolean pegarAXavi( boolean pegarpegarpegar ) {
		return true;
	}
	
	public static void main(String[] args) {
		
		HolaMundo hola = new HolaMundo();
		hola.holaMundo();
		
		System.out.println( "Task 1" );
		System.out.println("2");
		
		System.out.println( "JODER POR FIN!!!" );
		
		System.out.println("L");
		
		
		System.out.println("P");
		
		hola.david();
		
		hola.pegarAXavi(true);
		
		
	}

}
