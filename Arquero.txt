class Arquero extends Jugador{

	private int golesDetenidos;

	public Arquero(String nom, int su, int goles, int golesD){
		super(nom, su, goles);
		this.golesDetenidos = golesD;
	}

	public int getGolesDetenidos(){
		return golesDetenidos;
	}
}