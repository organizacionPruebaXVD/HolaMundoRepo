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
		System.out.println("El método PRO");
	}
	
	public static void xavi() {
		System.out.println("Hola");
	}
	
	
	public static void main(String[] args) {
		
		HolaMundo hola = new HolaMundo();
		hola.holaMundo();
		
		System.out.println( "Task 1" );
		System.out.println("2");
		
		xavi();
		
		System.out.println( "JODER POR FIN!!!" );
		
		System.out.println("L");
		
		
		System.out.println("P");
		
		hola.david();
		
		
	}

}
