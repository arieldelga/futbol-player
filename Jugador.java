class Jugador{
	
	private String nombre;
	private int sueldo;
	private int numGoles;
	private int golesDetenidos;

	public Jugador(String nom, int su, int goles){
		nombre = nom;
		sueldo = su;
		numGoles = goles;
	}

	public String getNombre(){
		return nombre;
	}

	public int getNumGoles(){
		return numGoles;
	}
}